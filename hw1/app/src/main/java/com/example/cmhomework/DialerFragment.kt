package com.example.cmhomework

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController

var buttonf1Name = "Dani"
var buttonf2Name = "easpa"
var buttonf3Name = "Rob"

var buttonf1Number = "09876"
var buttonf2Number = "12345"
var buttonf3Number = "54321"

class DialerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_dialer, container, false);
        var textView = view.findViewById<TextView>(R.id.textView)
        val backspace = view.findViewById<ImageButton>(R.id.backspaceButton)
        backspace.setOnClickListener(View.OnClickListener {
            var textViewString = textView.text.toString();
            if(!TextUtils.isEmpty(textViewString)) {
                textViewString  = textViewString.substring(0, textViewString.length - 1);

                textView.setText(textViewString);
            }
        })
        val callButton = view.findViewById<ImageButton>(R.id.callButton)
        callButton.setOnClickListener(View.OnClickListener {
            var textViewString = textView.text.toString();
            if(!TextUtils.isEmpty(textViewString)) {
                if((activity as MainActivity).checkPermission(Manifest.permission.CALL_PHONE,3)){
                    (activity as MainActivity).dialPhoneNumber(textViewString)
                }
            }
        })
        val button0 = view.findViewById<Button>(R.id.button0)
        button0.setOnClickListener(View.OnClickListener {
            textView.append("0");
        })
        val button1 = view.findViewById<Button>(R.id.button1)
        button1.setOnClickListener(View.OnClickListener {
            textView.append("1");
        })
        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener(View.OnClickListener {
            textView.append("2");
        })
        val button3 = view.findViewById<Button>(R.id.button3)
        button3.setOnClickListener(View.OnClickListener {
            textView.append("3");
        })
        val button4 = view.findViewById<Button>(R.id.button4)
        button4.setOnClickListener(View.OnClickListener {
            textView.append("4");
        })
        val button5 = view.findViewById<Button>(R.id.button5)
        button5.setOnClickListener(View.OnClickListener {
            textView.append("5");
        })
        val button6 = view.findViewById<Button>(R.id.button6)
        button6.setOnClickListener(View.OnClickListener {
            textView.append("6");
        })
        val button7 = view.findViewById<Button>(R.id.button7)
        button7.setOnClickListener(View.OnClickListener {
            textView.append("7");
        })
        val button8 = view.findViewById<Button>(R.id.button8)
        button8.setOnClickListener(View.OnClickListener {
            textView.append("8");
        })
        val button9 = view.findViewById<Button>(R.id.button9)
        button9.setOnClickListener(View.OnClickListener {
            textView.append("9");
        })
        val buttona = view.findViewById<Button>(R.id.buttona)
        buttona.setOnClickListener(View.OnClickListener {
            textView.append("\u2217");
        })
        val buttonc = view.findViewById<Button>(R.id.buttonc)
        buttonc.setOnClickListener(View.OnClickListener {
            textView.append("#");
        })
        val buttonf1 = view.findViewById<Button>(R.id.buttonf1)
        buttonf1.setText(buttonf1Name)
        buttonf1.setOnClickListener(View.OnClickListener {
            textView.setText(buttonf1Number);
        })
        buttonf1.setOnLongClickListener( View.OnLongClickListener{
            val bundle = bundleOf("key" to "buttonf1")
            view.findNavController().navigate(R.id.action_dialerFragment_to_changeFragment,bundle)
            true
        })
        setFragmentResultListener("buttonf1") { requestKey, bundle ->
            buttonf1Name = bundle.getString("name").toString()
            buttonf1Number = bundle.getString("phone").toString()
            buttonf1.setText(buttonf1Name)
        }
        val buttonf2 = view.findViewById<Button>(R.id.buttonf2)
        buttonf2.setText(buttonf2Name)
        buttonf2.setOnClickListener(View.OnClickListener {
            textView.setText(buttonf2Number);
        })
        buttonf2.setOnLongClickListener( View.OnLongClickListener{
            val bundle = bundleOf("key" to "buttonf2")
            view.findNavController().navigate(R.id.action_dialerFragment_to_changeFragment,bundle)
            true
        })
        setFragmentResultListener("buttonf2") { requestKey, bundle ->
            buttonf2Name = bundle.getString("name").toString()
            buttonf2Number = bundle.getString("phone").toString()
            buttonf2.setText(buttonf2Name)
        }
        val buttonf3 = view.findViewById<Button>(R.id.buttonf3)
        buttonf3.setText(buttonf3Name)
        buttonf3.setOnClickListener(View.OnClickListener {
            textView.setText(buttonf3Number);
        })
        buttonf3.setOnLongClickListener( View.OnLongClickListener{
            val bundle = bundleOf("key" to "buttonf3")
            view.findNavController().navigate(R.id.action_dialerFragment_to_changeFragment,bundle)
            true
        })
        setFragmentResultListener("buttonf3") { requestKey, bundle ->
            buttonf3Name = bundle.getString("name").toString()
            buttonf3Number = bundle.getString("phone").toString()
            buttonf3.setText(buttonf3Name)
        }
        return view;
    }

}