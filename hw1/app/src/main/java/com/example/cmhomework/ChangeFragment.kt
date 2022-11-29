package com.example.cmhomework

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.findNavController

class ChangeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_change, container, false);
        val buttonCancel = view.findViewById<Button>(R.id.buttonCancel)
        buttonCancel.setOnClickListener(View.OnClickListener {
            view.findNavController().navigate(R.id.action_changeFragment_to_dialerFragment)
        })
        val buttonUpdate = view.findViewById<Button>(R.id.buttonUpdate)
        buttonUpdate.setOnClickListener(View.OnClickListener {
            var result  = ""
            result = getArguments()?.getString("key").toString()
            var textView = view.findViewById<TextView>(R.id.editTextTextPersonName)
            var textViewString = textView.text.toString();
            var phoneView = view.findViewById<TextView>(R.id.editTextPhone)
            var phoneViewString = phoneView.text.toString();
            if(!TextUtils.isEmpty(textViewString) && !TextUtils.isEmpty(phoneViewString)) {
                setFragmentResult(result, bundleOf("phone" to phoneViewString,"name" to textViewString))
                view.findNavController().navigate(R.id.action_changeFragment_to_dialerFragment)
            }
            // Use the Kotlin extension in the fragment-ktx artifact
        })
        return view
    }
}