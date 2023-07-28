package com.example.rentsease.mainsection.ui.houses

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rentsease.R
import com.example.rentsease.mainsection.adapter.UnVerifiedRecyclearViewAdapter
import com.example.rentsease.mainsection.adapter.VerifiedRecyclerViewAdapter
import com.example.rentsease.mainsection.data.House

//// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UnVerifiedFragment.newInstance] factory method to
 * create an instance of this fragment.
 */



private lateinit var unVerifiedRecyclear: RecyclerView
private lateinit var houseList:ArrayList<House>
private lateinit var unVerifiedHouseAdapter:UnVerifiedRecyclearViewAdapter
class UnVerifiedFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_un_verified, container, false)
        unVerifiedRecyclear = view.findViewById(R.id.unVerifiedRecyclerView)
        unVerifiedRecyclear.setHasFixedSize(true)
        unVerifiedRecyclear.layoutManager = LinearLayoutManager(context)

        houseList = ArrayList()


        houseList.add(
            House(
                R.drawable.nine, "120,000/Year", "SelfCon",
                R.drawable.ten, "300,00/Year", "One Bed Room with Toilet"
            )
        )

        houseList.add(
            House(
                R.drawable.eleven, "250,000/Year", "Two bed room Duplex",
                R.drawable.twelve, "700,000/Year", "Two bedRoom Flat"
            )
        )

        houseList.add(
            House(
                R.drawable.thirteen, "270,000/year", "Single Room Apartment",
                R.drawable.fourteen, "570,000/Year", "Two room with Ttoilet and BirthRoom"
            )
        )

        houseList.add(
            House(
                R.drawable.house, "200,000/Year", "Twe Bed Room Duplex",
                R.drawable.house2, "100,00/Month", "Virgin SelfCon"
            )
        )

        houseList.add(
            House(
                R.drawable.house3, "620,000/year", "3 bed room Flat",
                R.drawable.four, "500,000/Year", "3 BedRoom Flat"
            )
        )

        houseList.add(
            House(
                R.drawable.five, "#900,000", "DuPlex",
                R.drawable.six, "450,000/Year", "two virgin SelfCon"
            )
        )

        houseList.add(
            House(
                R.drawable.seven, "60,000", "Single Room",
                R.drawable.eight, "#90,000/Year", "Students size SelfCon"
            )
        )

        unVerifiedHouseAdapter = UnVerifiedRecyclearViewAdapter(houseList)
        unVerifiedRecyclear.adapter = unVerifiedHouseAdapter

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment UnVerifiedFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            UnVerifiedFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

        fun newInstance()=
            UnVerifiedFragment()

    }
}