package com.example.gigr.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gigr.data.repository.AuthRepository
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed class SignUpEvent {
    object NavigateToLogin : SignUpEvent()
}

class SignUpViewModel : ViewModel() {

    private val authRepository = AuthRepository()

    private val _email = MutableStateFlow("")
    val email = _email.asStateFlow()

    private val _password = MutableStateFlow("")
    val password = _password.asStateFlow()

    private val _confirmPassword = MutableStateFlow("")
    val confirmPassword = _confirmPassword.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val _arePasswordsMatching = MutableStateFlow(true)
    val arePasswordsMatching = _arePasswordsMatching.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error = _error.asStateFlow()

    private val _eventFlow = MutableSharedFlow<SignUpEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEmailChange(email: String) {
        _email.value = email
    }

    fun onPasswordChange(password: String) {
        _password.value = password
        if (!_arePasswordsMatching.value) {
            _arePasswordsMatching.value = true
        }
    }

    fun onConfirmPasswordChange(confirmPassword: String) {
        _confirmPassword.value = confirmPassword
        if (!_arePasswordsMatching.value) {
            _arePasswordsMatching.value = true
        }
    }

    fun onSignUpClicked() {
        if (password.value != confirmPassword.value) {
            _arePasswordsMatching.value = false
            return
        }

        _arePasswordsMatching.value = true
        _error.value = null 
        _isLoading.value = true

        viewModelScope.launch {
            try {
                authRepository.signUp(email.value, password.value)
                _isLoading.value = false
                _eventFlow.emit(SignUpEvent.NavigateToLogin)
            } catch (e: Exception) {
                _error.value = e.message 
                _isLoading.value = false
            }
        }
    }
}