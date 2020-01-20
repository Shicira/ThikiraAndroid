package com.dsm.restaurant.presentation.ui.register

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.dsm.restaurant.R
import com.dsm.restaurant.databinding.FragmentRegister4Binding
import com.dsm.restaurant.presentation.ui.base.BaseFragment
import com.dsm.restaurant.presentation.util.setupSnackbar
import com.dsm.restaurant.presentation.util.setupToast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_register4.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class Register4Fragment : BaseFragment<FragmentRegister4Binding>() {
    override val layoutResId: Int = R.layout.fragment_register4

    private val viewModel: RegisterViewModel by sharedViewModel(from = {
        findNavController().getViewModelStoreOwner(R.id.nav_graph)
    })

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tb_register4.setNavigationOnClickListener { findNavController().popBackStack() }

        btn_register.setOnClickListener {
            findNavController().popBackStack(R.id.loginFragment, true)
        }

        setupSnackbar(viewModel.snackbarEvent, Snackbar.LENGTH_SHORT)
        setupToast(viewModel.toastEvent, Toast.LENGTH_SHORT)

        binding.viewModel = viewModel
    }
}