package com.example.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCpmapctActivity
import com.example.viewbinding.databinding.ActivityMainBinding


//View binding is a feature that makes it easier to write code that interacts with views.
// //Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module.
// An instance of a binding class contains direct references to all views that have an ID in the corresponding layout.

//In most cases, view binding replaces findViewById.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
