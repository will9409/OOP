package kr.ac.smu.cs.smtoday


import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AlertDialog
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.SimpleAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_blacklist.*
import kotlinx.android.synthetic.main.activity_book_mark.*

class BookMark : AppCompatActivity() {
    var res=Restaurant()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_mark)
        var name=intent.getStringExtra("Name")
        imageButton10.setOnClickListener { view->
            finish()
        }
        var pref=getSharedPreferences("data",0)
        var set=pref.getStringSet("bname",null)
        var namelist=ArrayList<String>()

        var mainlist=ArrayList<HashMap<String,String>>()
        var i=0

        while(i<res.address.size){
            var j=0

            for(str in set){
                if(set.elementAt(j)==res.name[i]){
                    var map=HashMap<String,String>()
                    map.put("name",res.name[i])
                    map.put("address",res.address[i])
                    map.put("tell",res.tell[i])
                    mainlist.add(map)
                }
                j++
            }

            i++
        }

        var mainListkeys=arrayOf("name","address","tell")
        var mainListids= intArrayOf(R.id.resName,R.id.resAdd,R.id.resTell)

        var mainAdapter= SimpleAdapter(this,mainlist,R.layout.main_list_view,mainListkeys,mainListids)


        if(mainlist.size==0) {
            textView2.text="등록된 즐겨찾기가 없습니다."
        }
        else{
            var adapter = ListAdapter(this,mainlist)
            adapter.notifyDataSetChanged()
            ListView3.adapter = adapter
        }


    }
    inner class ListAdapter(context: Context, item:ArrayList<HashMap<String,String>>): BaseAdapter(){

        val mitem=item
        val mcontext=context
        override fun getCount(): Int {
            return mitem.size
        }

        override fun getItem(position: Int): Any? {
            return null
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

            var convert: View?=convertView
            if(convertView==null)
                convert=layoutInflater.inflate(R.layout.black_list_view,null)   //row 3 에 대해서 만들겠다.
            //각각의 버튼 만들기
            var text: TextView?=convert?.findViewById<TextView>(R.id.resName)
            var text2: TextView?=convert?.findViewById<TextView>(R.id.resAdd)
            var text3: TextView?=convert?.findViewById<TextView>(R.id.resTell)
            var button1: ImageButton?=convert?.findViewById<ImageButton>(R.id.imageButton9)


            text?.setOnClickListener { view->
                var intent= Intent(baseContext,Information::class.java)
                intent.putExtra("Name",mitem[position].get("name"))
                intent.putExtra("tell",mitem[position].get("tell"))
                startActivity(intent)
            }
            text2?.setOnClickListener { view->
                var intent= Intent(baseContext,Information::class.java)
                intent.putExtra("Name",mitem[position].get("name"))
                intent.putExtra("tell",mitem[position].get("tell"))
                startActivity(intent)
            }
            text3?.setOnClickListener { view->
                var intent= Intent(baseContext,Information::class.java)
                intent.putExtra("Name",mitem[position].get("name"))
                intent.putExtra("tell",mitem[position].get("tell"))
                startActivity(intent)
            }
            button1?.setOnClickListener { view->
                var builder = AlertDialog.Builder(mcontext)
                builder.setTitle("즐겨찾기")
                builder.setMessage("즐겨찾기에서 삭제하시겠습니까?")
                builder.setPositiveButton("yes") { dialog, which ->
                    var pref=getSharedPreferences("data",0)
                    var set=pref.getStringSet("bname",null)
                    set.remove(mitem[position].get("name"))
                    var editor=pref.edit()
                    editor.putStringSet("bname",set)
                    editor.commit()
                    var namelist=ArrayList<String>()

                    var mainlist=ArrayList<HashMap<String,String>>()
                    var i=0

                    while(i<res.address.size){
                        var j=0

                        for(str in set){
                            if(set.elementAt(j)==res.name[i]){
                                var map=HashMap<String,String>()
                                map.put("name",res.name[i])
                                map.put("address",res.address[i])
                                map.put("tell",res.tell[i])
                                mainlist.add(map)
                            }
                            j++
                        }

                        i++
                    }

                    var mainListkeys=arrayOf("name","address","tell")
                    var mainListids= intArrayOf(R.id.resName,R.id.resAdd,R.id.resTell)


                    if(mainlist.size==0) textView2.text="등록된 즐겨찾기가 없습니다."

                    var adapter = ListAdapter(mcontext,mainlist)

                    ListView3.adapter = adapter



                }
                builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> })

                builder.show()}

            text3?.text=mitem[position].get("tell")
            text2?.text=mitem[position].get("address")
            text?.text=mitem[position].get("name")
            return convert
        }





    }


}
