package com.dosthim.androidnavigation.ui.dashboard

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.dosthim.androidnavigation.R

class DashboardDetailsFragment : Fragment(R.layout.fragment_dashboard_details) {

    companion object {
        fun newInstance() = DashboardDetailsFragment()
    }

    private lateinit var viewModel: DashboardDetailsViewModel
    private val args: DashboardDetailsFragmentArgs by navArgs()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DashboardDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val type = args.typeName
        view.findViewById<TextView>(R.id.detailsId).text = "data:: data $type"
    }
}