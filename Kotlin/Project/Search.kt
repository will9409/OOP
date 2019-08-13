package kr.ac.smu.cs.smtoday

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.SimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_search.*
import kr.ac.smu.cs.smtoday.R.*
class Search : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        var res=Restaurant()

        button3.setOnClickListener { view->
            var mainlist=ArrayList<HashMap<String,String>>()
            var i=0
            while(i<res.address.size){
                if(res.name[i]==editText.text.toString()){
                    //button3.text=editText.text
                    var map=HashMap<String,String>()
                    map.put("name",res.name[i])
                    map.put("address",res.address[i])
                    map.put("tell",res.tell[i])
                    mainlist.add(map)
                }
                i++
            }
            if(mainlist.size==0){
                var builder = AlertDialog.Builder(this)
                //builder.setTitle("즐겨찾기")
                builder.setMessage("검색 결과가 존재하지 않습니다.")
                builder.setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which ->

                })


                builder.show()
            }
            var Listkeys=arrayOf("name","address","tell")
            var Listids= intArrayOf(R.id.resName,R.id.resAdd,R.id.resTell)
            var mainAdapter= SimpleAdapter(this,mainlist, layout.main_list_view,Listkeys,Listids)
            slistView.adapter=mainAdapter
            slistView.setOnItemClickListener { parent, view, position, id ->
                var intent= Intent(this,Information::class.java)
                intent.putExtra("Name",mainlist[position].get("name"))
                intent.putExtra("tell",mainlist[position].get("tell"))
                startActivity(intent)
            }
        }
        imageButton8.setOnClickListener { view->
            finish()
        }



    }
}
