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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CrewBio extends AppCompatActivity  {

    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    public static final String Lname = "lnameKey";
    public static final String Aname= "anameKey";
    public static final String Lpmn= "lpmnKey";
    public static final String Lpmu= "lpmuKey";
    public static final String Apmn= "apmnKey";
    public static final String Apmu= "apmuKey";
    public static final String Lrcn= "lrcnKey";
    public static final String Arcn= "arcnKey";
    public static final String Lrcu= "lrcuKey";
    public static final String Arcu= "arcuKey";
    public static final String Lacn= "lacnKey";
    public static final String Aacn= "aacnKey";
    public static final String Lacu= "lacuKey";
    public static final String Aacu= "aacuKey";
    public static final String Ldc= "ldcKey";
    public static final String Adc= "adcKey";
    public static final String Lnli= "lnliKey";
    public static final String Anli= "anliKey";
    public static final String Lmd= "lmdKey";
    public static final String Amd= "amdKey";
    public static final String Lpt= "lptKey";
    public static final String Apt= "aptKey";
    public static final String Lds= "ldsKey";
    public static final String Ads= "adsKey";




    private EditText editTextLname;
    private EditText editTextAname;
    private EditText editTextLnli;
    private EditText editTextAnli;
    private EditText editTextLpmn;
    private EditText editTextApmn;
    private EditText editTextLpmu;
    private EditText editTextApmu;
    private EditText editTextLrcn;
    private EditText editTextArcn;
    private EditText editTextLrcu;
    private EditText editTextArcu;
    private EditText editTextLacn;
    private EditText editTextAacn;
    private EditText editTextLacu;
    private EditText editTextAacu;
    private EditText editTextLdc;
    private EditText editTextAdc;
    private EditText editTextLmd;
    private EditText editTextAmd;
    private EditText editTextLpt;
    private EditText editTextApt;
    private EditText editTextLds;
    private EditText editTextAds;

    private Button button3;






    public String name;
    public String unit;
    public String loco;
    public String insp_date;
    public String designation;
    public String department;
    public String bpc_date;
    public String train_no;
    public String from_depart;
    public String to_arrive;
    public String load_no;
    public String bpbf_pressure;
    public String bpc_no;
    public String punct_details;
    public String h_o;
    public String sch_details;

    public String crew_lp_name;
    public String crew_alp_name;
    public String crew_lp_pme_done_dt;
    public String crew_lp_pme_due_dt;
    public String crew_alp_pme_done_dt;
    public String crew_alp_pme_due_dt;
    public String crew_lp_ref_done_dt;
    public String crew_lp_ref_due_dt;
    public String crew_alp_ref_done_dt;
    public String crew_alp_ref_due_dt;
    public String crew_lp_abs_done_dt;
    public String crew_lp_abs_due_dt;
    public String crew_alp_abs_done_dt;
    public String crew_alp_abs_due_dt;
    public String crew_lp_driving_compt;
    public String crew_alp_driving_compt;
    public String crew_lp_nominated_li;
    public String crew_alp_nominated_li;
    public String crew_lp_last_monitoring_nli;
    public String crew_alp_last_monitoring_nli;
    public String crew_lp_psycho_date;
    public String crew_alp_psycho_date;
    public String crew_lp_safety_date;
    public String crew_alp_safety_date;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crew_bio);

        editTextLname = (EditText) findViewById(R.id.editTextLname);
        editTextAname = (EditText) findViewById(R.id.editTextAname);
        editTextLnli = (EditText) findViewById(R.id.editTextLnli);
        editTextAnli = (EditText) findViewById(R.id.editTextAnli);
        editTextLpmn = (EditText) findViewById(R.id.editTextLpmn);
        editTextLpmu = (EditText) findViewById(R.id.editTextLpmu);
        editTextApmn = (EditText) findViewById(R.id.editTextApmn);
        editTextApmu = (EditText) findViewById(R.id.editTextApmu);
        editTextLrcn = (EditText) findViewById(R.id.editTextLrcn);
        editTextLrcu = (EditText) findViewById(R.id.editTextLrcu);
        editTextArcn = (EditText) findViewById(R.id.editTextArcn);
        editTextArcu = (EditText) findViewById(R.id.editTextArcu);
        editTextLacn = (EditText) findViewById(R.id.editTextLacn);
        editTextLacu = (EditText) findViewById(R.id.editTextLacu);
        editTextAacn = (EditText) findViewById(R.id.editTextAacn);
        editTextAacu = (EditText) findViewById(R.id.editTextAacu);
        editTextLdc = (EditText) findViewById(R.id.editTextLdc);
        editTextAdc = (EditText) findViewById(R.id.editTextAdc);
        editTextLmd = (EditText) findViewById(R.id.editTextLmd);
        editTextAmd = (EditText) findViewById(R.id.editTextAmd);
        editTextLpt = (EditText) findViewById(R.id.editTextLpt);
        editTextApt = (EditText) findViewById(R.id.editTextApt);
        editTextLds = (EditText) findViewById(R.id.editTextLds);
        editTextAds = (EditText) findViewById(R.id.editTextAds);

        button3 = (Button) findViewById(R.id.button3);
        button3.setEnabled(false);





        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("name");
        unit = bundle.getString("unit");
        loco = bundle.getString("loco");
        insp_date = bundle.getString("insp_date");
        designation = bundle.getString("designation");
        department = bundle.getString("department");
        bpc_date = bundle.getString("bpc_date");
        train_no = bundle.getString("train_no");
        from_depart = bundle.getString("from_depart");
        to_arrive = bundle.getString("to_arrive");
        load_no = bundle.getString("load_no");
        bpbf_pressure = bundle.getString("bpbf_pressure");
        bpc_no = bundle.getString("bpc_no");
        punct_details = bundle.getString("punct_details");
        h_o = bundle.getString("h_o");
        sch_details = bundle.getString("sch_details");

        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Lname)) {
            editTextLname.setText(sharedpreferences.getString(Lname, ""));
        }

        if (sharedpreferences.contains(Aname)) {
            editTextAname.setText(sharedpreferences.getString(Aname, ""));
        }

        if (sharedpreferences.contains(Lpmn)) {
            editTextLpmn.setText(sharedpreferences.getString(Lpmn, ""));
        }

        if (sharedpreferences.contains(Lpmu)) {
            editTextLpmu.setText(sharedpreferences.getString(Lpmu, ""));
        }

        if (sharedpreferences.contains(Apmn)) {
            editTextApmn.setText(sharedpreferences.getString(Apmn, ""));
        }

        if (sharedpreferences.contains(Apmu)) {
            editTextApmu.setText(sharedpreferences.getString(Apmu, ""));
        }

        if (sharedpreferences.contains(Lrcn)) {
            editTextLrcn.setText(sharedpreferences.getString(Lrcn, ""));
        }

        if (sharedpreferences.contains(Lrcu)) {
            editTextLrcu.setText(sharedpreferences.getString(Lrcu, ""));
        }

        if (sharedpreferences.contains(Arcn)) {
            editTextArcn.setText(sharedpreferences.getString(Arcn, ""));
        }

        if (sharedpreferences.contains(Arcu)) {
            editTextArcu.setText(sharedpreferences.getString(Arcu, ""));
        }

        if (sharedpreferences.contains(Lacn)) {
            editTextLacn.setText(sharedpreferences.getString(Lacn, ""));
        }

        if (sharedpreferences.contains(Lacu)) {
            editTextLacu.setText(sharedpreferences.getString(Lacu, ""));
        }

        if (sharedpreferences.contains(Aacn)) {
            editTextAacn.setText(sharedpreferences.getString(Aacn, ""));
        }

        if (sharedpreferences.contains(Aacu)) {
            editTextAacu.setText(sharedpreferences.getString(Aacu, ""));
        }

        if (sharedpreferences.contains(Lnli)) {
            editTextLnli.setText(sharedpreferences.getString(Lnli, ""));
        }

        if (sharedpreferences.contains(Anli)) {
            editTextAnli.setText(sharedpreferences.getString(Anli, ""));
        }

        if (sharedpreferences.contains(Ldc)) {
            editTextLdc.setText(sharedpreferences.getString(Ldc, ""));
        }

        if (sharedpreferences.contains(Adc)) {
            editTextAdc.setText(sharedpreferences.getString(Adc, ""));
        }

        if (sharedpreferences.contains(Lmd)) {
            editTextLmd.setText(sharedpreferences.getString(Lmd, ""));
        }

        if (sharedpreferences.contains(Amd)) {
            editTextAmd.setText(sharedpreferences.getString(Amd, ""));
        }

        if (sharedpreferences.contains(Lpt)) {
            editTextLpt.setText(sharedpreferences.getString(Lpt, ""));
        }

        if (sharedpreferences.contains(Apt)) {
            editTextApt.setText(sharedpreferences.getString(Apt, ""));
        }

        if (sharedpreferences.contains(Lds)) {
            editTextLds.setText(sharedpreferences.getString(Lds, ""));
        }

        if (sharedpreferences.contains(Ads)) {
            editTextAds.setText(sharedpreferences.getString(Ads, ""));
        }














        editTextLpmn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker3();
            }
        });

        editTextLpmu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker4();
            }
        });

        editTextApmn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker5();
            }
        });

        editTextApmu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker6();
            }
        });

        editTextLrcn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker7();
            }
        });

        editTextLrcu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker8();
            }
        });

        editTextArcn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker9();
            }
        });

        editTextArcu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker10();
            }
        });

        editTextLacn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker11();
            }
        });

        editTextLacu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker12();
            }
        });

        editTextAacn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker13();
            }
        });

        editTextAacu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker14();
            }
        });

        editTextLdc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker15();
            }
        });

        editTextAdc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker16();
            }
        });

        editTextLmd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker17();
            }
        });

        editTextAmd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker18();
            }
        });

        editTextLpt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker19();
            }
        });

        editTextApt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker20();
            }
        });

        editTextLds.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker21();
            }
        });

        editTextAds.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                showDatePicker22();
            }
        });













    }


    public void Save1 (View view) {

        button3.setEnabled(true);

        crew_lp_name = editTextLname.getText().toString();
        crew_alp_name = editTextAname.getText().toString();
        crew_lp_pme_done_dt = editTextLpmn.getText().toString();
        crew_lp_pme_due_dt = editTextLpmu.getText().toString();
        crew_alp_pme_done_dt = editTextApmn.getText().toString();
        crew_alp_pme_due_dt = editTextApmu.getText().toString();
        crew_lp_ref_done_dt = editTextLrcn.getText().toString();
        crew_lp_ref_due_dt = editTextLrcu.getText().toString();
        crew_alp_ref_done_dt = editTextArcn.getText().toString();
        crew_alp_ref_due_dt = editTextArcu.getText().toString();
        crew_lp_abs_done_dt = editTextLacn.getText().toString();
        crew_lp_abs_due_dt = editTextLacu.getText().toString();
        crew_alp_abs_done_dt = editTextAacn.getText().toString();
        crew_alp_abs_due_dt = editTextAacu.getText().toString();
        crew_lp_driving_compt = editTextLdc.getText().toString();
        crew_alp_driving_compt = editTextAdc.getText().toString();
        crew_lp_nominated_li = editTextLnli.getText().toString();
        crew_alp_nominated_li = editTextAnli.getText().toString();
        crew_lp_last_monitoring_nli = editTextLmd.getText().toString();
        crew_alp_last_monitoring_nli = editTextAmd.getText().toString();
        crew_lp_psycho_date = editTextLpt.getText().toString();
        crew_alp_psycho_date = editTextApt.getText().toString();
        crew_lp_safety_date = editTextLds.getText().toString();
        crew_alp_safety_date = editTextAds.getText().toString();







        SharedPreferences.Editor editor = sharedpreferences.edit();



        editor.putString(Lname, crew_lp_name);
        editor.putString(Aname, crew_alp_name);
        editor.putString(Lpmn, crew_lp_pme_done_dt);
        editor.putString(Lpmu, crew_lp_pme_due_dt);
        editor.putString(Apmn, crew_alp_pme_done_dt);
        editor.putString(Apmu, crew_alp_pme_due_dt);
        editor.putString(Lrcn, crew_lp_ref_done_dt);
        editor.putString(Lrcu, crew_lp_ref_due_dt);
        editor.putString(Arcn, crew_alp_ref_done_dt);
        editor.putString(Arcu, crew_alp_ref_due_dt);
        editor.putString(Lacn, crew_lp_abs_done_dt);
        editor.putString(Lacu, crew_lp_abs_due_dt);
        editor.putString(Aacn, crew_alp_abs_done_dt);
        editor.putString(Aacu, crew_alp_abs_due_dt);
        editor.putString(Ldc, crew_lp_driving_compt);
        editor.putString(Adc, crew_alp_driving_compt);
        editor.putString(Lnli, crew_lp_nominated_li);
        editor.putString(Anli, crew_alp_nominated_li);
        editor.putString(Lmd, crew_lp_last_monitoring_nli);
        editor.putString(Amd, crew_alp_last_monitoring_nli);
        editor.putString(Lpt, crew_lp_psycho_date);
        editor.putString(Apt, crew_alp_psycho_date);
        editor.putString(Lds, crew_lp_safety_date);
        editor.putString(Ads, crew_alp_safety_date);






        editor.commit();

        Toast toast = Toast.makeText(getApplicationContext(), "Saved on phone", Toast.LENGTH_SHORT);
        toast.show();



    }



    private void showDatePicker3() {
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
        date.setCallBack(ondate3);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker4() {
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
        date.setCallBack(ondate4);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker5() {
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
        date.setCallBack(ondate5);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker6() {
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
        date.setCallBack(ondate6);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker7() {
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
        date.setCallBack(ondate7);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker8() {
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
        date.setCallBack(ondate8);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker9() {
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
        date.setCallBack(ondate9);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker10() {
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
        date.setCallBack(ondate10);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker11() {
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
        date.setCallBack(ondate11);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker12() {
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
        date.setCallBack(ondate12);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker13() {
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
        date.setCallBack(ondate13);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker14() {
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
        date.setCallBack(ondate14);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker15() {
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
        date.setCallBack(ondate15);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker16() {
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
        date.setCallBack(ondate16);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker17() {
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
        date.setCallBack(ondate17);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker18() {
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
        date.setCallBack(ondate18);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker19() {
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
        date.setCallBack(ondate19);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker20() {
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
        date.setCallBack(ondate20);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker21() {
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
        date.setCallBack(ondate21);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }

    private void showDatePicker22() {
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
        date.setCallBack(ondate22);

//        date.show(,"Date Picker");
        date.show(getSupportFragmentManager(),"Date Picker");
    }







    DatePickerDialog.OnDateSetListener ondate3 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLpmn.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate4 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLpmu.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate5 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextApmn.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate6 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextApmu.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate7 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLrcn.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate8 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLrcu.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate9 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextArcn.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate10 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextArcu.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate11 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLacn.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate12 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLacu.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate13 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextAacn.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate14 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextAacu.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate15 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLdc.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate16 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextAdc.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate17 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLmd.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate18 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextAmd.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate19 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLpt.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate20 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextApt.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate21 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextLds.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };

    DatePickerDialog.OnDateSetListener ondate22 = new DatePickerDialog.OnDateSetListener() {


        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            editTextAds.setText((String.valueOf(monthOfYear + 1)  + "-" + String.valueOf(dayOfMonth)
                    + "-" + String.valueOf(year)));
            Log.e("its in the picker","" );


        }

    };





    public void sendMessage1(View view)
    {
        Intent intent = new Intent(CrewBio.this, SafetyItems.class);
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

        intent.putExtra("crew_lp_name",crew_lp_name);
        intent.putExtra("crew_alp_name",crew_alp_name);
        intent.putExtra("crew_lp_pme_done_dt",crew_lp_pme_done_dt);
        intent.putExtra("crew_lp_pme_due_dt",crew_lp_pme_due_dt);
        intent.putExtra("crew_alp_pme_done_dt",crew_alp_pme_done_dt);
        intent.putExtra("crew_alp_pme_due_dt",crew_alp_pme_due_dt);
        intent.putExtra("crew_lp_ref_done_dt",crew_lp_ref_done_dt);
        intent.putExtra("crew_lp_ref_due_dt",crew_lp_ref_due_dt);
        intent.putExtra("crew_alp_ref_done_dt",crew_alp_ref_done_dt);
        intent.putExtra("crew_alp_ref_due_dt",crew_alp_ref_due_dt);
        intent.putExtra("crew_lp_abs_done_dt",crew_lp_abs_done_dt);
        intent.putExtra("crew_lp_abs_due_dt",crew_lp_abs_due_dt);
        intent.putExtra("crew_alp_abs_done_dt",crew_alp_abs_done_dt);
        intent.putExtra("crew_alp_abs_due_dt",crew_alp_abs_due_dt);
        intent.putExtra("crew_lp_driving_compt",crew_lp_driving_compt);
        intent.putExtra("crew_alp_driving_compt",crew_alp_driving_compt);
        intent.putExtra("crew_lp_nominated_li",crew_lp_nominated_li);
        intent.putExtra("crew_alp_nominated_li",crew_alp_nominated_li);
        intent.putExtra("crew_lp_last_monitoring_nli",crew_lp_last_monitoring_nli);
        intent.putExtra("crew_alp_last_monitoring_nli",crew_alp_last_monitoring_nli);
        intent.putExtra("crew_lp_psycho_date",crew_lp_psycho_date);
        intent.putExtra("crew_alp_psycho_date",crew_alp_psycho_date);
        intent.putExtra("crew_lp_safety_date",crew_lp_safety_date);
        intent.putExtra("crew_alp_safety_date",crew_alp_safety_date);






        startActivity(intent);
    }





}
