package com.example.shopp_partner.presentation.main
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shopp_partner.domain.entity.Product
import com.example.shopp_partner.domain.usercase.CreateBascket
import kotlinx.coroutines.launch


class MainViewModel(private val createBascket : CreateBascket) : ViewModel(){

    val text: MutableLiveData<String> = MutableLiveData()

    init {
        text.value = "modified text"
    }

    fun onClickAction(){
      viewModelScope.launch{
        createBascket.invoke(Product(prdct_name = "Pizza", price = 4.50))
    }
    }

}