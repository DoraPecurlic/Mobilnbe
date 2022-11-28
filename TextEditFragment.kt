package hr.ferit.dorapecurlic.orwma_lv1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class TextEditFragment: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_text_edit, container, false)
        val button = view.findViewById<Button>(R.id.saveButton)
        val textView = view.findViewById<TextView>(R.id.inputTextView)
        val editView = view.findViewById<EditText>(R.id.editText)

        button.setOnClickListener{
            textView.text = editView.text
        }



        return view
    }


}