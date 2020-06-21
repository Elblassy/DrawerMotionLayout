package app.elblasy.cordinatormotionlayout

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.drawer_layout.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_layout)

        motionLayout.setScrimColor(Color.TRANSPARENT)
        motionLayout.drawerElevation = 0F

        val header: View = nav_view.getHeaderView(0)
        val motion: MotionLayout = header.findViewById(R.id.menu)

        motionLayout.addDrawerListener(
            object : DrawerLayout.DrawerListener {
                override fun onDrawerStateChanged(newState: Int) {
                }

                override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                    motion.progress = slideOffset

                }

                override fun onDrawerClosed(drawerView: View) {
                }

                override fun onDrawerOpened(drawerView: View) {
                }

            }
        )

    }
}