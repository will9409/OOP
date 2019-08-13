package kr.ac.smu.cs.smtoday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.CameraUpdate



class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val smu = LatLng(37.600986,126.956319)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smu))


        val 교가루 = LatLng(37.600947,126.956487)
        val 봉구스밥버거 = LatLng(37.601283,126.956007)
        val 샌드앤닭 = LatLng(37.600988,126.956586)
        val 어뎅맛뎅 = LatLng(37.600875,126.955741)
        val 윤가네 = LatLng(37.601094,126.955968)
        val 치즈밥 = LatLng(37.600987,126.956613)
        val 토마토 = LatLng(37.601130,126.956030)
        val 함께식탁 = LatLng(37.601113,126.956262)

        var ress = Restaurant()

        var nname = intent.getStringExtra("nname")
        var ttell = intent.getStringExtra("ttell")

        if(nname == null){
            mMap.addMarker(MarkerOptions().position(교가루).title("교가루"))
            mMap.addMarker(MarkerOptions().position(봉구스밥버거).title("봉구스 밥버거"))
            mMap.addMarker(MarkerOptions().position(샌드앤닭).title("샌드앤닭"))
            mMap.addMarker(MarkerOptions().position(어뎅맛뎅).title("어뎅맛뎅"))
            mMap.addMarker(MarkerOptions().position(윤가네).title("윤가네"))
            mMap.addMarker(MarkerOptions().position(치즈밥).title("치즈밥이슈"))
            mMap.addMarker(MarkerOptions().position(토마토).title("토마토도시락"))
            mMap.addMarker(MarkerOptions().position(함께식탁).title("함께식탁"))
        }
        else{
            when(nname){
                ress.name[0] -> mMap.addMarker(MarkerOptions().position(교가루).title("교가루"))
                ress.name[1] -> mMap.addMarker(MarkerOptions().position(봉구스밥버거).title("봉구스 밥버거"))
                ress.name[2] -> mMap.addMarker(MarkerOptions().position(샌드앤닭).title("샌드앤닭"))
                ress.name[3] -> mMap.addMarker(MarkerOptions().position(어뎅맛뎅).title("어뎅맛뎅"))
                ress.name[4] -> mMap.addMarker(MarkerOptions().position(윤가네).title("윤가네"))
                ress.name[5] -> mMap.addMarker(MarkerOptions().position(치즈밥).title("치즈밥이슈"))
                ress.name[6] -> mMap.addMarker(MarkerOptions().position(토마토).title("토마토도시락"))
                ress.name[7] -> mMap.addMarker(MarkerOptions().position(함께식탁).title("함께식탁"))

            }
        }

        val zoom = CameraUpdateFactory.zoomTo(18F)
        googleMap.animateCamera(zoom)


    }
}
