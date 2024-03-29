package apps.iloyarte.melichallenge.utils

import android.app.Activity
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

// yet another shorter toast
fun Activity.toast(toast: String) {
    Toast.makeText(this, toast, Toast.LENGTH_SHORT).show()
}

fun Fragment.title(title: String){
    activity?.title = title
}


// Edit text soft keyboard submit event
fun EditText.onSubmit(func: () -> Unit) {
    setOnEditorActionListener { _, actionId, _ ->
        if (actionId == EditorInfo.IME_ACTION_DONE) {
            func()
        }
        true
    }
}