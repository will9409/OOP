package kr.ac.smu.cs.smtoday

import android.content.DialogInterface
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log.d
import android.view.ContextThemeWrapper
import kotlinx.android.synthetic.main.activity_information.*



class Information : AppCompatActivity() {


    var q = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        var name=intent.getStringExtra("Name")
        infName.text=name
        var tell=intent.getStringExtra("tell")
        textView5.text=tell
        imageButton6.setOnClickListener { view->
            finish()
        }
        var res=Restaurant()

        //textView7.text=res.map2.get(name)               메뉴 채우신 다음에 이거 주석 풀어주시면 됩니다.

        imageButton5.setOnClickListener { view ->
            var intent = Intent(this,MapsActivity::class.java)
            intent.putExtra("nname",name)
            intent.putExtra("ttell",tell)
            startActivity(intent)
        }


        q = intent.getIntExtra("sign",0)
        if(q == 1){
            var builder = AlertDialog.Builder(ContextThemeWrapper(this@Information,R.style.Theme_AppCompat_Light_Dialog))
            builder.setTitle("알림")
            builder.setMessage("배터리 충전이 가능한 식당입니다")
            builder.setPositiveButton("확인"){_,_ ->
                d("alert","ok")
            }

            builder.show()
        }
        button2.setOnClickListener { view ->

            var builder = AlertDialog.Builder(this)
            builder.setTitle("즐겨찾기")
            builder.setMessage("즐겨찾기에 추가하시겠습니까?")
            builder.setPositiveButton("yes", { dialog, which ->
                var pref=getSharedPreferences("data",0)
                var set=pref.getStringSet("bname",null)
                set.add(name)
                var editor=pref.edit()
                editor.putStringSet("bname",set)
                editor.commit()

            })
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> })

            builder.show()
        }

        button.setOnClickListener { view ->
            var builder = AlertDialog.Builder(this)
            builder.setTitle("블랙리스트")
            builder.setMessage("블랙리스트에 추가하시겠습니까?")
            builder.setPositiveButton("yes",{ dialog, which ->
                var pref=getSharedPreferences("data",0)
                var set=pref.getStringSet("lname",null)
                set.add(name)
                var editor=pref.edit()
                editor.putStringSet("lname",set)
                editor.commit()
                var intent=Intent(this,MainActivity::class.java)
                setResult(100,intent)


            })
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> })

            builder.show()
        }




    }
}
