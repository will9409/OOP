package kr.ac.smu.cs.smtoday

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ListView
import android.widget.SimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pref=getSharedPreferences("data",0)
        var editor=pref.edit()
        var set=HashSet<String>()
        editor.putStringSet("lname",set)
        editor.putStringSet("bname",set)
        editor.commit()


        var res=Restaurant()
        var mainlist=ArrayList<HashMap<String,String>>()
        var i=0
        var inset=pref.getStringSet("lname",null)
        loop@while(i<res.address.size){
            var j=0
            /*for(str in inset){
                if(res.name[i]==inset.elementAt(j)){
                    i++
                    continue@loop
                }
                j++
            }*/

            var map=HashMap<String,String>()
            map.put("name",res.name[i])
            map.put("address",res.address[i])
            map.put("tell",res.tell[i])
            mainlist.add(map)
            i++
        }
        var mainListkeys=arrayOf("name","address","tell")
        var mainListids= intArrayOf(R.id.resName,R.id.resAdd,R.id.resTell)
        var mainAdapter=SimpleAdapter(this,mainlist,R.layout.main_list_view,mainListkeys,mainListids)
        ListView1.adapter=mainAdapter
        //mainlist.removeAt   리스트 삭제 메소드
        //검색
        imageButton3.setOnClickListener { view->
            var intent=Intent(this,Search::class.java)
            startActivityForResult(intent,1)
        }
        //블랙리스트
        imageButton2.setOnClickListener { view->
            var intent=Intent(this,Blacklist::class.java)
            startActivityForResult(intent,1)
        }
        //즐겨찾기
        imageButton.setOnClickListener { view->
            var intent=Intent(this,BookMark::class.java)
            startActivityForResult(intent,1)
        }
        imageButton4.setOnClickListener{view ->
            var intent = Intent(this,MapsActivity::class.java)
            startActivityForResult(intent,1)
        }
        ListView1.setOnItemClickListener { parent, view, position, id ->
            var intent= Intent(this,Information::class.java)
            intent.putExtra("Name",mainlist[position].get("name"))
            intent.putExtra("tell",mainlist[position].get("tell"))
            startActivityForResult(intent,1)
        }


        imageButton4.setOnClickListener{view ->
            var intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when(resultCode){
            100->{
                var pref=getSharedPreferences("data",0)
                var editor=pref.edit()
                var set=HashSet<String>()



                var res=Restaurant()
                var mainlist=ArrayList<HashMap<String,String>>()
                var i=0
                var inset=pref.getStringSet("lname",null)
                loop@while(i<res.address.size){
                    var j=0
                    for(str in inset){
                        if(res.name[i]==inset.elementAt(j)){
                            i++
                            continue@loop
                        }
                        j++
                    }

                    var map=HashMap<String,String>()
                    map.put("name",res.name[i])
                    map.put("address",res.address[i])
                    map.put("tell",res.tell[i])
                    mainlist.add(map)
                    i++
                }
                var mainListkeys=arrayOf("name","address","tell")
                var mainListids= intArrayOf(R.id.resName,R.id.resAdd,R.id.resTell)
                var mainAdapter=SimpleAdapter(this,mainlist,R.layout.main_list_view,mainListkeys,mainListids)
                ListView1.adapter=mainAdapter
            }
        }
    }
}
