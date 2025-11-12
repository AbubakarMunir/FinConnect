package com.example.gigr.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gigr.data.repository.AuthRepository
import kotlinx.coroutines.launch

class SignUpViewModel : ViewModel() {

    private val authRepository = AuthRepository()

    fun signUpUser(email: String, password: String) {
        viewModelScope.launch {
            // TODO: Add error handling and loading state
            authRepository.signUp(email, password)
        }
    }
}
