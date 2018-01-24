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
import android.widget.RadioGroup;
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


public class SafetyItems extends AppCompatActivity  {

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


    private RadioGroup radioSpm;
    private RadioGroup radioflal;
    private RadioGroup radiolight;
    private RadioGroup radiomarker;
    private RadioGroup radioafi;
    private RadioGroup radiovcd;
    private RadioGroup radiohorn;
    private RadioGroup radiossc;
    private RadioGroup radioshp;
    private RadioGroup radiosuc;
    private RadioGroup radiofe;
    private RadioGroup radioedfe;
    private RadioGroup radiohbpb;
    private RadioGroup radioww;
    private RadioGroup radiosf;
    private RadioGroup radiod;
    private RadioGroup radiodv;
    private RadioGroup radiotc;
    private RadioGroup radiorgf;
    private RadioGroup radiosss;



    private RadioButton radioButton;
    private RadioButton radioButtonflal;
    private RadioButton radioButtonlight;
    private RadioButton radioButtonmarker;
    private RadioButton radioButtonafi;
    private RadioButton radioButtonvcd;
    private RadioButton radioButtonhorn;
    private RadioButton radioButtonssc;
    private RadioButton radioButtonshp;
    private RadioButton radioButtonsuc;
    private RadioButton radioButtonfe;
    private RadioButton radioButtonedfe;
    private RadioButton radioButtonhbpb;
    private RadioButton radioButtonww;
    private RadioButton radioButtonsf;
    private RadioButton radioButtond;
    private RadioButton radioButtondv;
    private RadioButton radioButtontc;
    private RadioButton radioButtonrgf;
    private RadioButton radioButtonsss;


    private Button btnDisplay;
    private Button button7;

    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    public static final String Spm = "spmKey";
    public static final String Flal = "flalKey";
    public static final String Marker = "markerKey";
    public static final String Light = "lightKey";
    public static final String Afi = "afiKey";
    public static final String Vcd = "vcdKey";
    public static final String Horn = "hornKey";
    public static final String Ssc = "sscKey";
    public static final String Shp = "shpKey";
    public static final String Suc = "sucKey";
    public static final String Fe = "feKey";
    public static final String Edfe = "edfeKey";
    public static final String Hbpb = "hbpbKey";
    public static final String Ww = "wwKey";
    public static final String Sf = "sfKey";
    public static final String D = "dKey";
    public static final String Dv = "dvKey";
    public static final String Tc = "tcKey";
    public static final String Rgf = "rgfKey";
    public static final String Sss = "sssKey";


    public String si_spm;
    public String si_fl_afl;
    public String si_head_light;
    public String si_markerlight;
    public String si_afl;
    public String si_vcd;
    public String si_horn;
    public String si_ssc;
    public String si_shp_bp_fp;
    public String si_safety_u_clamp;
    public String si_fire_exting_no;
    public String si_fire_exting_exp_date;
    public String si_hand_parking_brake;
    public String si_ww;
    public String si_spare_fuse;
    public String si_detonator_no;
    public String si_detonator_validity;
    public String si_tricolor_torch;
    public String si_red_green_flag;
    public String si_spare_spect;





    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_items);
        context = this.getApplication();

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

        crew_lp_name = bundle.getString("crew_lp_name");
        crew_alp_name = bundle.getString("crew_alp_name");
        crew_lp_pme_done_dt = bundle.getString("crew_lp_pme_done_dt");
        crew_lp_pme_due_dt = bundle.getString("crew_lp_pme_due_dt");
        crew_alp_pme_done_dt = bundle.getString("crew_alp_pme_done_dt");
        crew_alp_pme_due_dt = bundle.getString("crew_alp_pme_due_dt");
        crew_lp_ref_done_dt = bundle.getString("crew_lp_ref_done_dt");
        crew_lp_ref_due_dt = bundle.getString("crew_lp_ref_due_dt");
        crew_alp_ref_done_dt = bundle.getString("crew_alp_ref_done_dt");
        crew_alp_ref_due_dt = bundle.getString("crew_alp_ref_due_dt");
        crew_lp_abs_done_dt = bundle.getString("crew_lp_abs_done_dt");
        crew_lp_abs_due_dt = bundle.getString("crew_lp_abs_due_dt");
        crew_alp_abs_done_dt = bundle.getString("crew_alp_abs_done_dt");
        crew_alp_abs_due_dt = bundle.getString("crew_alp_abs_due_dt");
        crew_lp_driving_compt = bundle.getString("crew_lp_driving_compt");
        crew_alp_driving_compt = bundle.getString("crew_alp_driving_compt");
        crew_lp_nominated_li = bundle.getString("crew_lp_nominated_li");
        crew_alp_nominated_li = bundle.getString("crew_alp_nominated_li");
        crew_lp_last_monitoring_nli = bundle.getString("crew_lp_last_monitoring_nli");
        crew_alp_last_monitoring_nli = bundle.getString("crew_alp_last_monitoring_nli");
        crew_lp_psycho_date = bundle.getString("crew_lp_psycho_date");
        crew_alp_psycho_date = bundle.getString("crew_alp_psycho_date");
        crew_lp_safety_date = bundle.getString("crew_lp_safety_date");
        crew_alp_safety_date = bundle.getString("crew_alp_safety_date");


        radioSpm =(RadioGroup)findViewById(R.id.radioSpm);
        radioflal =(RadioGroup)findViewById(R.id.radioflal);
        radiolight =(RadioGroup)findViewById(R.id.radiolight);
        radiomarker =(RadioGroup)findViewById(R.id.radiomarker);
        radioafi =(RadioGroup)findViewById(R.id.radioafi);
        radiovcd =(RadioGroup)findViewById(R.id.radiovcd);
        radiohorn =(RadioGroup)findViewById(R.id.radiohorn);
        radiossc =(RadioGroup)findViewById(R.id.radiossc);
        radioshp =(RadioGroup)findViewById(R.id.radioshp);
        radiosuc =(RadioGroup)findViewById(R.id.radiosuc);
        radiofe =(RadioGroup)findViewById(R.id.radiofe);
        radioedfe =(RadioGroup)findViewById(R.id.radioedfe);
        radiohbpb =(RadioGroup)findViewById(R.id.radiohbpb);
        radioww =(RadioGroup)findViewById(R.id.radioww);
        radiosf =(RadioGroup)findViewById(R.id.radiosf);
        radiod =(RadioGroup)findViewById(R.id.radiod);
        radiodv =(RadioGroup)findViewById(R.id.radiodv);
        radiotc =(RadioGroup)findViewById(R.id.radiotc);
        radiorgf =(RadioGroup)findViewById(R.id.radiorgf);
        radiosss =(RadioGroup)findViewById(R.id.radiosss);




        radioButton = (RadioButton)findViewById(R.id.radioButton);
        radioButtonflal = (RadioButton)findViewById(R.id.radioButtonflal);
        radioButtonlight = (RadioButton)findViewById(R.id.radioButtonlight);
        radioButtonmarker = (RadioButton)findViewById(R.id.radioButtonmarker);
        radioButtonafi = (RadioButton)findViewById(R.id.radioButtonafi);
        radioButtonvcd = (RadioButton)findViewById(R.id.radioButtonvcd);
        radioButtonhorn = (RadioButton)findViewById(R.id.radioButtonhorn);
        radioButtonssc = (RadioButton)findViewById(R.id.radioButtonssc);
        radioButtonshp = (RadioButton)findViewById(R.id.radioButtonshp);
        radioButtonsuc = (RadioButton)findViewById(R.id.radioButtonsuc);
        radioButtonfe = (RadioButton)findViewById(R.id.radioButtonfe);
        radioButtonedfe = (RadioButton)findViewById(R.id.radioButtonedfe);
        radioButtonhbpb = (RadioButton)findViewById(R.id.radioButtonhbpb);
        radioButtonww = (RadioButton)findViewById(R.id.radioButtonww);
        radioButtonsf = (RadioButton)findViewById(R.id.radioButtonsf);
        radioButtond = (RadioButton)findViewById(R.id.radioButtond);
        radioButtondv = (RadioButton)findViewById(R.id.radioButtondv);
        radioButtontc = (RadioButton)findViewById(R.id.radioButtontc);
        radioButtonrgf = (RadioButton)findViewById(R.id.radioButtonrgf);
        radioButtonsss = (RadioButton)findViewById(R.id.radioButtonsss);




        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);


        radioSpm.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener);
        radioflal.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener1);
        radiolight.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener2);
        radiomarker.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener3);
        radioafi.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener4);
        radiovcd.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener5);
        radiohorn.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener6);
        radiossc.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener7);
        radioshp.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener8);
        radiosuc.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener9);
        radiofe.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener10);
        radioedfe.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener11);
        radiohbpb.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener12);
        radioww.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener13);
        radiosf.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener14);
        radiod.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener15);
        radiodv.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener16);
        radiotc.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener17);
        radiorgf.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener18);
        radiosss.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener19);






        button7 = (Button) findViewById(R.id.button7);
        button7.setEnabled(false);






        LoadPreferences();


        addListenerOnButton();



    }




    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton = (RadioButton)radioSpm.findViewById(checkedId);
                    int checkedIndex = radioSpm.indexOfChild(checkedRadioButton);



                    SavePreferences(Spm, checkedIndex);



                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener1 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioflal.findViewById(checkedId);
                    int checkedIndex1 = radioflal.indexOfChild(checkedRadioButton1);



                    SavePreferences(Flal, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener2 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiolight.findViewById(checkedId);
                    int checkedIndex1 = radiolight.indexOfChild(checkedRadioButton1);



                    SavePreferences(Light, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener3 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiomarker.findViewById(checkedId);
                    int checkedIndex1 = radiomarker.indexOfChild(checkedRadioButton1);



                    SavePreferences(Marker, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener4 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioafi.findViewById(checkedId);
                    int checkedIndex1 = radioafi.indexOfChild(checkedRadioButton1);



                    SavePreferences(Afi, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener5 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiovcd.findViewById(checkedId);
                    int checkedIndex1 = radiovcd.indexOfChild(checkedRadioButton1);



                    SavePreferences(Vcd, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener6 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiohorn.findViewById(checkedId);
                    int checkedIndex1 = radiohorn.indexOfChild(checkedRadioButton1);



                    SavePreferences(Horn, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener7 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiossc.findViewById(checkedId);
                    int checkedIndex1 = radiossc.indexOfChild(checkedRadioButton1);



                    SavePreferences(Ssc, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener8 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioshp.findViewById(checkedId);
                    int checkedIndex1 = radioshp.indexOfChild(checkedRadioButton1);



                    SavePreferences(Shp, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener9 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiosuc.findViewById(checkedId);
                    int checkedIndex1 = radiosuc.indexOfChild(checkedRadioButton1);



                    SavePreferences(Suc, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener10 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiofe.findViewById(checkedId);
                    int checkedIndex1 = radiofe.indexOfChild(checkedRadioButton1);



                    SavePreferences(Fe, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener11 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioedfe.findViewById(checkedId);
                    int checkedIndex1 = radioedfe.indexOfChild(checkedRadioButton1);



                    SavePreferences(Edfe, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener12 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiohbpb.findViewById(checkedId);
                    int checkedIndex1 = radiohbpb.indexOfChild(checkedRadioButton1);



                    SavePreferences(Hbpb, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener13 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioww.findViewById(checkedId);
                    int checkedIndex1 = radioww.indexOfChild(checkedRadioButton1);



                    SavePreferences(Ww, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener14 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiosf.findViewById(checkedId);
                    int checkedIndex1 = radiosf.indexOfChild(checkedRadioButton1);



                    SavePreferences(Sf, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener15 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiod.findViewById(checkedId);
                    int checkedIndex1 = radiod.indexOfChild(checkedRadioButton1);



                    SavePreferences(D, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener16 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiodv.findViewById(checkedId);
                    int checkedIndex1 = radiodv.indexOfChild(checkedRadioButton1);



                    SavePreferences(Dv, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener17 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiotc.findViewById(checkedId);
                    int checkedIndex1 = radiotc.indexOfChild(checkedRadioButton1);



                    SavePreferences(Tc, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener18 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiorgf.findViewById(checkedId);
                    int checkedIndex1 = radiorgf.indexOfChild(checkedRadioButton1);



                    SavePreferences(Rgf, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener19 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radiosss.findViewById(checkedId);
                    int checkedIndex1 = radiosss.indexOfChild(checkedRadioButton1);



                    SavePreferences(Sss, checkedIndex1);

                }};














    private void SavePreferences(String key, int value){
        getSharedPreferences("spmKey", MODE_PRIVATE);
        getSharedPreferences("flalKey", MODE_PRIVATE);
        getSharedPreferences("lightKey", MODE_PRIVATE);
        getSharedPreferences("markerKey", MODE_PRIVATE);
        getSharedPreferences("afiKey", MODE_PRIVATE);
        getSharedPreferences("vcdKey", MODE_PRIVATE);
        getSharedPreferences("hornKey", MODE_PRIVATE);
        getSharedPreferences("sscKey", MODE_PRIVATE);
        getSharedPreferences("shpKey", MODE_PRIVATE);
        getSharedPreferences("sucKey", MODE_PRIVATE);
        getSharedPreferences("feKey", MODE_PRIVATE);
        getSharedPreferences("edfeKey", MODE_PRIVATE);
        getSharedPreferences("hbpbKey", MODE_PRIVATE);
        getSharedPreferences("wwKey", MODE_PRIVATE);
        getSharedPreferences("sfKey", MODE_PRIVATE);
        getSharedPreferences("dKey", MODE_PRIVATE);
        getSharedPreferences("dvKey", MODE_PRIVATE);
        getSharedPreferences("tcKey", MODE_PRIVATE);
        getSharedPreferences("rgfKey", MODE_PRIVATE);
        getSharedPreferences("sssKey", MODE_PRIVATE);


        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }



    private void LoadPreferences(){
        getSharedPreferences("mypref", MODE_PRIVATE);

        int savedRadioIndex = sharedpreferences.getInt(Spm, 0);
        RadioButton savedCheckedRadioButton = (RadioButton)radioSpm.getChildAt(savedRadioIndex);
        savedCheckedRadioButton.setChecked(true);

        int savedRadioIndex1 = sharedpreferences.getInt(Flal, 0);
        RadioButton savedCheckedRadioButton1 = (RadioButton)radioflal.getChildAt(savedRadioIndex1);
        savedCheckedRadioButton1.setChecked(true);

        int savedRadioIndex2 = sharedpreferences.getInt(Light, 0);
        RadioButton savedCheckedRadioButton2 = (RadioButton)radiolight.getChildAt(savedRadioIndex2);
        savedCheckedRadioButton2.setChecked(true);

        int savedRadioIndex3 = sharedpreferences.getInt(Marker, 0);
        RadioButton savedCheckedRadioButton3 = (RadioButton)radiomarker.getChildAt(savedRadioIndex3);
        savedCheckedRadioButton3.setChecked(true);

        int savedRadioIndex4 = sharedpreferences.getInt(Afi, 0);
        RadioButton savedCheckedRadioButton4 = (RadioButton)radioafi.getChildAt(savedRadioIndex4);
        savedCheckedRadioButton4.setChecked(true);

        int savedRadioIndex5 = sharedpreferences.getInt(Vcd, 0);
        RadioButton savedCheckedRadioButton5 = (RadioButton)radiovcd.getChildAt(savedRadioIndex5);
        savedCheckedRadioButton5.setChecked(true);

        int savedRadioIndex6 = sharedpreferences.getInt(Horn, 0);
        RadioButton savedCheckedRadioButton6 = (RadioButton)radiohorn.getChildAt(savedRadioIndex6);
        savedCheckedRadioButton6.setChecked(true);

        int savedRadioIndex7 = sharedpreferences.getInt(Ssc, 0);
        RadioButton savedCheckedRadioButton7 = (RadioButton)radiossc.getChildAt(savedRadioIndex7);
        savedCheckedRadioButton7.setChecked(true);

        int savedRadioIndex8 = sharedpreferences.getInt(Shp, 0);
        RadioButton savedCheckedRadioButton8 = (RadioButton)radioshp.getChildAt(savedRadioIndex8);
        savedCheckedRadioButton8.setChecked(true);

        int savedRadioIndex9 = sharedpreferences.getInt(Suc, 0);
        RadioButton savedCheckedRadioButton9 = (RadioButton)radiosuc.getChildAt(savedRadioIndex9);
        savedCheckedRadioButton9.setChecked(true);

        int savedRadioIndex10 = sharedpreferences.getInt(Fe, 0);
        RadioButton savedCheckedRadioButton10 = (RadioButton)radiofe.getChildAt(savedRadioIndex10);
        savedCheckedRadioButton10.setChecked(true);

        int savedRadioIndex11 = sharedpreferences.getInt(Edfe, 0);
        RadioButton savedCheckedRadioButton11 = (RadioButton)radioedfe.getChildAt(savedRadioIndex11);
        savedCheckedRadioButton11.setChecked(true);

        int savedRadioIndex12 = sharedpreferences.getInt(Hbpb, 0);
        RadioButton savedCheckedRadioButton12 = (RadioButton)radiohbpb.getChildAt(savedRadioIndex12);
        savedCheckedRadioButton12.setChecked(true);

        int savedRadioIndex13 = sharedpreferences.getInt(Ww, 0);
        RadioButton savedCheckedRadioButton13 = (RadioButton)radioww.getChildAt(savedRadioIndex13);
        savedCheckedRadioButton13.setChecked(true);

        int savedRadioIndex14 = sharedpreferences.getInt(Sf, 0);
        RadioButton savedCheckedRadioButton14 = (RadioButton)radiosf.getChildAt(savedRadioIndex14);
        savedCheckedRadioButton14.setChecked(true);

        int savedRadioIndex15 = sharedpreferences.getInt(D, 0);
        RadioButton savedCheckedRadioButton15 = (RadioButton)radiod.getChildAt(savedRadioIndex15);
        savedCheckedRadioButton15.setChecked(true);

        int savedRadioIndex16 = sharedpreferences.getInt(Dv, 0);
        RadioButton savedCheckedRadioButton16 = (RadioButton)radiodv.getChildAt(savedRadioIndex16);
        savedCheckedRadioButton16.setChecked(true);

        int savedRadioIndex17 = sharedpreferences.getInt(Tc, 0);
        RadioButton savedCheckedRadioButton17 = (RadioButton)radiotc.getChildAt(savedRadioIndex17);
        savedCheckedRadioButton17.setChecked(true);

        int savedRadioIndex18 = sharedpreferences.getInt(Rgf, 0);
        RadioButton savedCheckedRadioButton18 = (RadioButton)radiorgf.getChildAt(savedRadioIndex18);
        savedCheckedRadioButton18.setChecked(true);

        int savedRadioIndex19 = sharedpreferences.getInt(Sss, 0);
        RadioButton savedCheckedRadioButton19 = (RadioButton)radiosss.getChildAt(savedRadioIndex19);
        savedCheckedRadioButton19.setChecked(true);



    }





    public void addListenerOnButton() {



        radioSpm = (RadioGroup) findViewById(R.id.radioSpm);
        radioflal = (RadioGroup) findViewById(R.id.radioflal);
        radiolight = (RadioGroup) findViewById(R.id.radiolight);
        radiomarker = (RadioGroup) findViewById(R.id.radiomarker);
        radioafi = (RadioGroup) findViewById(R.id.radioafi);
        radiovcd = (RadioGroup) findViewById(R.id.radiovcd);
        radiohorn = (RadioGroup) findViewById(R.id.radiohorn);
        radiossc = (RadioGroup) findViewById(R.id.radiossc);
        radioshp = (RadioGroup) findViewById(R.id.radioshp);
        radiosuc = (RadioGroup) findViewById(R.id.radiosuc);
        radiofe = (RadioGroup) findViewById(R.id.radiofe);
        radioedfe = (RadioGroup) findViewById(R.id.radioedfe);
        radiohbpb = (RadioGroup) findViewById(R.id.radiohbpb);
        radioww = (RadioGroup) findViewById(R.id.radioww);
        radiosf =(RadioGroup)findViewById(R.id.radiosf);
        radiod =(RadioGroup)findViewById(R.id.radiod);
        radiodv =(RadioGroup)findViewById(R.id.radiodv);
        radiotc =(RadioGroup)findViewById(R.id.radiotc);
        radiorgf =(RadioGroup)findViewById(R.id.radiorgf);
        radiosss =(RadioGroup)findViewById(R.id.radiosss);



        btnDisplay = (Button) findViewById(R.id.btnDisplay);




        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioSpm.getCheckedRadioButtonId();
                int selectedId1 = radioflal.getCheckedRadioButtonId();
                int selectedId2 = radiolight.getCheckedRadioButtonId();
                int selectedId3 = radiomarker.getCheckedRadioButtonId();
                int selectedId4 = radioafi.getCheckedRadioButtonId();
                int selectedId5 = radiovcd.getCheckedRadioButtonId();
                int selectedId6 = radiohorn.getCheckedRadioButtonId();
                int selectedId7 = radiossc.getCheckedRadioButtonId();
                int selectedId8 = radioshp.getCheckedRadioButtonId();
                int selectedId9 = radiosuc.getCheckedRadioButtonId();
                int selectedId10 = radiofe.getCheckedRadioButtonId();
                int selectedId11 = radioedfe.getCheckedRadioButtonId();
                int selectedId12 = radiohbpb.getCheckedRadioButtonId();
                int selectedId13 = radioww.getCheckedRadioButtonId();
                int selectedId14 = radiosf.getCheckedRadioButtonId();
                int selectedId15 = radiod.getCheckedRadioButtonId();
                int selectedId16 = radiodv.getCheckedRadioButtonId();
                int selectedId17 = radiotc.getCheckedRadioButtonId();
                int selectedId18 = radiorgf.getCheckedRadioButtonId();
                int selectedId19 = radiosss.getCheckedRadioButtonId();



                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                radioButtonflal = (RadioButton) findViewById(selectedId1);
                radioButtonlight = (RadioButton) findViewById(selectedId2);
                radioButtonmarker = (RadioButton) findViewById(selectedId3);
                radioButtonafi = (RadioButton) findViewById(selectedId4);
                radioButtonvcd = (RadioButton) findViewById(selectedId5);
                radioButtonhorn = (RadioButton) findViewById(selectedId6);
                radioButtonssc = (RadioButton) findViewById(selectedId7);
                radioButtonshp = (RadioButton) findViewById(selectedId8);
                radioButtonsuc = (RadioButton) findViewById(selectedId9);
                radioButtonfe = (RadioButton) findViewById(selectedId10);
                radioButtonedfe = (RadioButton) findViewById(selectedId11);
                radioButtonhbpb = (RadioButton) findViewById(selectedId12);
                radioButtonww = (RadioButton) findViewById(selectedId13);
                radioButtonsf = (RadioButton)findViewById(selectedId14);
                radioButtond = (RadioButton)findViewById(selectedId15);
                radioButtondv = (RadioButton)findViewById(selectedId16);
                radioButtontc = (RadioButton)findViewById(selectedId17);
                radioButtonrgf = (RadioButton)findViewById(selectedId18);
                radioButtonsss = (RadioButton)findViewById(selectedId19);





//                Toast.makeText(SafetyItems.this,
//                        radioButton.getText(), Toast.LENGTH_SHORT).show();
//                Toast.makeText(SafetyItems.this,
//                        radioButtonflal.getText(), Toast.LENGTH_SHORT).show();

                si_spm = radioButton.getText().toString();
                si_fl_afl = radioButtonflal.getText().toString();
                si_head_light = radioButtonlight.getText().toString();
                si_markerlight = radioButtonmarker.getText().toString();
                si_afl = radioButtonafi.getText().toString();
                si_vcd = radioButtonvcd.getText().toString();
                si_horn = radioButtonhorn.getText().toString();
                si_ssc = radioButtonssc.getText().toString();
                si_shp_bp_fp = radioButtonshp.getText().toString();
                si_safety_u_clamp = radioButtonsuc.getText().toString();
                si_fire_exting_no = radioButtonfe.getText().toString();
                si_fire_exting_exp_date = radioButtonedfe.getText().toString();
                si_hand_parking_brake = radioButtonhbpb.getText().toString();
                si_ww = radioButtonww.getText().toString();
                si_spare_fuse = radioButtonsf.getText().toString();
                si_detonator_no = radioButtond.getText().toString();
                si_detonator_validity = radioButtondv.getText().toString();
                si_tricolor_torch = radioButtontc.getText().toString();
                si_red_green_flag = radioButtonrgf.getText().toString();
                si_spare_spect = radioButtonsss.getText().toString();



                Toast toast = Toast.makeText(getApplicationContext(), "Saved on phone", Toast.LENGTH_SHORT);
                toast.show();

                button7.setEnabled(true);

            }

        });


    }



    public void sendMessage2(View view)
    {
        Intent intent = new Intent(SafetyItems.this, CrewPerformance.class);

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

        intent.putExtra("si_spm",si_spm);
        intent.putExtra("si_fl_afl",si_fl_afl);
        intent.putExtra("si_head_light",si_head_light);
        intent.putExtra("si_markerlight",si_markerlight);
        intent.putExtra("si_afl",si_afl);
        intent.putExtra("si_vcd",si_vcd);
        intent.putExtra("si_horn",si_horn);
        intent.putExtra("si_ssc",si_ssc);
        intent.putExtra("si_shp_bp_fp",si_shp_bp_fp);
        intent.putExtra("si_safety_u_clamp",si_safety_u_clamp);
        intent.putExtra("si_fire_exting_no",si_fire_exting_no);
        intent.putExtra("si_fire_exting_exp_date",si_fire_exting_exp_date);
        intent.putExtra("si_hand_parking_brake",si_hand_parking_brake);
        intent.putExtra("si_ww",si_ww);
        intent.putExtra("si_spare_fuse",si_spare_fuse);
        intent.putExtra("si_detonator_no",si_detonator_no);
        intent.putExtra("si_detonator_validity",si_detonator_validity);
        intent.putExtra("si_tricolor_torch",si_tricolor_torch);
        intent.putExtra("si_red_green_flag",si_red_green_flag);
        intent.putExtra("si_spare_spect",si_spare_spect);


        startActivity(intent);
    }




}
