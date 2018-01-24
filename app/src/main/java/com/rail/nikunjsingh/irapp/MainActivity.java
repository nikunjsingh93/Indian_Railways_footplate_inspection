package com.rail.nikunjsingh.irapp;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;



import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.jar.Attributes;




public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private Button button1;
    private EditText editTextName;
    private EditText editTextLoco;
    private EditText editTextDesignation;
    private EditText editText2;
    private EditText editText9;
    private EditText editTextTrainNo;
    private EditText editTextFrom;
    private EditText editTextTo;
    private EditText editTextLoad2;
    private EditText editTextBpcNo;
    private EditText editTextBpbf;
    private EditText editTextHo;
    private EditText editTextSch;
    private EditText editTextPunct;
    private String array_spinner[] = {"BB","BSL","BSLWS","BYWS","HQ","MTNWS","NGP","PA","PRWS","SUR","WORKSHOP"};
    private String array_spinner1[] = {"ACCOUNTS","ADMIN","AUDIT","COMMERCIAL","CONSTRUCTION","CONVERSION","CRS","ELECTRICAL","ENGINEERING",
                                       "INFORMATION TECHNOLOGY","MECHANICAL","MEDICAL","MTN WORKSHOP","OPERATING","PERSONNEL","PR WORKSHOP",
                                        "PUBLICITY","SAFETY","SECURITY","SIGNAL AND TELECOMMUNICATION","STORES","VIGILANCE","ZRTI"};



    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Loco = "locoKey";
    public static final String Date1 = "date1Key";
    public static final String Designation = "designationKey";
    public static final String Date2 = "date2key";
    public static final String TrainNo = "trainkey";
    public static final String From = "fromKey";
    public static final String To = "toKey";
    public static final String Load2 = "loadKey";
    public static final String Bpbf = "bpbfKey";
    public static final String Bpcno = "bpcnoKey";
    public static final String Punct = "PunctKey";
    public static final String Ho = "HoKey";
    public static final String Sch = "SchKey";






    Context context;
    String name;
    String loco;
    String insp_date;
    String designation;
    String unit;
    String department;
    String bpc_date;
    String train_no;
    String from_depart;
    String to_arrive;
    String load_no;
    String bpbf_pressure;
    String bpc_no;
    String punct_details;
    String h_o;
    String sch_details;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this.getApplication();

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextLoco = (EditText) findViewById(R.id.editTextLoco);
        editTextDesignation = (EditText) findViewById(R.id.editTextDesignation);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText9 = (EditText) findViewById(R.id.editText9);
        editTextTrainNo = (EditText) findViewById(R.id.editTextTrainNo);
        editTextFrom = (EditText) findViewById(R.id.editTextFrom);
        editTextTo = (EditText) findViewById(R.id.editTextTo);
        editTextLoad2 = (EditText) findViewById(R.id.editTextLoad2);
        editTextBpcNo = (EditText) findViewById(R.id.editTextBpcNo);
        editTextBpbf = (EditText) findViewById(R.id.editTextBpbf);
        editTextHo = (EditText) findViewById(R.id.editTextHo);
        editTextSch = (EditText) findViewById(R.id.editTextSch);
        editTextPunct = (EditText) findViewById(R.id.editTextPunct);

        button1 = (Button) findViewById(R.id.button1);
        button1.setEnabled(false);



        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);



        if (sharedpreferences.contains(Name)) {
            editTextName.setText(sharedpreferences.getString(Name, ""));
        }

        if (sharedpreferences.contains(Loco)) {
                editTextLoco.setText(sharedpreferences.getString(Loco, ""));
        }

        if (sharedpreferences.contains(Date1)) {
            editText2.setText(sharedpreferences.getString(Date1, ""));
        }

        if (sharedpreferences.contains(Date2)) {
            editText9.setText(sharedpreferences.getString(Date2, ""));
        }

        if (sharedpreferences.contains(Designation)) {
            editTextDesignation.setText(sharedpreferences.getString(Designation, ""));
        }

        if (sharedpreferences.contains(TrainNo)) {
            editTextTrainNo.setText(sharedpreferences.getString(TrainNo, ""));
        }

        if (sharedpreferences.contains(From)) {
            editTextFrom.setText(sharedpreferences.getString(From, ""));
        }

        if (sharedpreferences.contains(To)) {
            editTextTo.setText(sharedpreferences.getString(To, ""));
        }

        if (sharedpreferences.contains(Load2)) {
            editTextLoad2.setText(sharedpreferences.getString(Load2, ""));
        }

        if (sharedpreferences.contains(Bpbf)) {
            editTextBpbf.setText(sharedpreferences.getString(Bpbf, ""));
        }

        if (sharedpreferences.contains(Bpcno)) {
            editTextBpcNo.setText(sharedpreferences.getString(Bpcno, ""));
        }

        if (sharedpreferences.contains(Punct)) {
            editTextPunct.setText(sharedpreferences.getString(Punct, ""));
        }

        if (sharedpreferences.contains(Ho)) {
            editTextHo.setText(sharedpreferences.getString(Ho, ""));
        }

        if (sharedpreferences.contains(Sch)) {
            editTextSch.setText(sharedpreferences.getString(Sch, ""));
        }











        Spinner s = (Spinner) findViewById(R.id.unit);

        s.setOnItemSelectedListener(this);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_spinner);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(dataAdapter);

        s.setSelection(sharedpreferences.getInt("spinnerSelection",0));



        Spinner s1 = (Spinner) findViewById(R.id.department);

        s1.setOnItemSelectedListener(this);
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_spinner1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(dataAdapter1);

        s1.setSelection(sharedpreferences.getInt("spinnerSelection1",0));


        editText2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });

        editText9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker1();
            }
        });


    }

    public void Save(View view) {

        button1.setEnabled(true);

        name = editTextName.getText().toString();
        loco = editTextLoco.getText().toString();
        insp_date = editText2.getText().toString();
        designation = editTextDesignation.getText().toString();
        bpc_date = editText9.getText().toString();
        train_no = editTextTrainNo.getText().toString();
        from_depart = editTextFrom.getText().toString();
        to_arrive = editTextTo.getText().toString();
        load_no = editTextLoad2.getText().toString();
        bpbf_pressure = editTextBpbf.getText().toString();
        bpc_no = editTextBpcNo.getText().toString();
        punct_details = editTextPunct.getText().toString();
        h_o = editTextHo.getText().toString();
        sch_details = editTextSch.getText().toString();



        SharedPreferences.Editor editor = sharedpreferences.edit();


        editor.putString(Name, name);
        editor.putString(Loco, loco);
        editor.putString(Date1, insp_date);
        editor.putString(Designation, designation);
        editor.putString(Date2, bpc_date);
        editor.putString(TrainNo, train_no);
        editor.putString(From, from_depart);
        editor.putString(To,to_arrive);
        editor.putString(Load2,load_no);
        editor.putString(Bpbf,bpbf_pressure);
        editor.putString(Bpcno,bpc_no);
        editor.putString(Punct,punct_details);
        editor.putString(Ho,h_o);
        editor.putString(Sch,sch_details);


        Spinner s = (Spinner) findViewById(R.id.unit);
        Spinner s1 = (Spinner) findViewById(R.id.department);


        int selectedPosition = s.getSelectedItemPosition();
        editor.putInt("spinnerSelection", selectedPosition);

        int selectedPosition1 = s1.getSelectedItemPosition();
        editor.putInt("spinnerSelection1", selectedPosition1);



        editor.commit();

        Toast toast = Toast.makeText(getApplicationContext(), "Saved on phone", Toast.LENGTH_SHORT);
        toast.show();



    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getId()) {
            case R.id.unit:
                unit = parent.getItemAtPosition(position).toString();


                break;
            case R.id.department:
                department = parent.getItemAtPosition(position).toString();
                break;
            default:
                break;
        }

        // Showing selected spinner item
//        Toast.makeText(parent.getContext(), "Selected: " + unit, Toast.LENGTH_LONG).show();
//
//        Toast.makeText(parent.getContext(), "Selected: " + department, Toast.LENGTH_LONG).show();
    }






    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    private void showDatePicker() {
        DatePickerFragment date = new DatePickerFragment();
        /**
         * Set Up Current Date Into dialog
         */
        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putInt("month", calender.get(Calendar.MONTH));
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);
        /**
         * Set Call back to capture selected date
         */
        date.setCallBack(ondate);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker1() {
        DatePickerFragment date = new DatePickerFragment();
        /**
         * Set Up Current Date Into dialog
         */
        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putInt("month", calender.get(Calendar.MONTH));
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);
        /**
         * Set Call back to capture selected date
         */
        date.setCallBack(ondate1);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    DatePickerDialog.OnDateSetListener ondate = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editText2.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate1 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editText9.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );



        }

    };


    public void sendMessage(View view)
    {
        Intent intent = new Intent(MainActivity.this, CrewBio.class);
        intent.putExtra("name",name);
        intent.putExtra("unit",unit);
        intent.putExtra("loco",loco);
        intent.putExtra("insp_date",insp_date);
        intent.putExtra("designation",designation);
        intent.putExtra("department",department);
        intent.putExtra("bpc_date",bpc_date);
        intent.putExtra("train_no",train_no);
        intent.putExtra("from_depart",from_depart);
        intent.putExtra("to_arrive",to_arrive);
        intent.putExtra("load_no",load_no);
        intent.putExtra("bpbf_pressure",bpbf_pressure);
        intent.putExtra("bpc_no",bpc_no);
        intent.putExtra("punct_details",punct_details);
        intent.putExtra("h_o",h_o);
        intent.putExtra("sch_details",sch_details);




        startActivity(intent);
    }






}
