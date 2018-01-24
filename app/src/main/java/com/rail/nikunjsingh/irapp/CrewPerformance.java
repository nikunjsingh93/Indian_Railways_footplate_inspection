package com.rail.nikunjsingh.irapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CrewPerformance extends AppCompatActivity {

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

    public String cp_sober;
    public String cp_lp_bp;
    public String cp_exchange_signal;
    public String cp_whistled;
    public String cp_looked_back;
    public String cp_proper_authority;
    public String cp_caution_order;
    public String cp_max_permissible_speed;
    public String cp_repeating_signal;
    public String cp_adj_line;
    public String cp_neutral_section;
    public String cp_alp_round;
    public String cp_coasting;
    public String cp_logbook;
    public String cp_braking_techniques;
    public String cp_rest;
    public String cp_uniform;
    public String cp_cug_off;
    public String cp_whf_communication;
    public String cp_load_brake;
    public String cp_co_readable;
    public String cp_foulingmark;
    public String cp_platform;
    public String cp_unauthorised_person;
    public String cp_habit_unusual;
    public String cp_alp_moisture;
    public String cp_habit_cms;
    public String cp_dbr;



    private RadioGroup radioSober;
    private RadioGroup radioFeel;
    private RadioGroup radioSignal;
    private RadioGroup radioWhistle;
    private RadioGroup radioLooked;
    private RadioGroup radioReceipt;
    private RadioGroup radioCaution;
    private RadioGroup radioSpeed;
    private RadioGroup radioCalling;
    private RadioGroup radioPassage;
    private RadioGroup radioProcedure;
    private RadioGroup radioRound;
    private RadioGroup radioCoasting;
    private RadioGroup radioLog;
    private RadioGroup radioBraking;
    private RadioGroup radioRest;
    private RadioGroup radioUniform;
    private RadioGroup radioCug;
    private RadioGroup radioCommunication;
    private RadioGroup radioLoad1;
    private RadioGroup radioReadable;
    private RadioGroup radioFouling;
    private RadioGroup radioStoppage;
    private RadioGroup radioUnauthorised;
    private RadioGroup radioHabbit;
    private RadioGroup radioCab;
    private RadioGroup radioDefect;
    private RadioGroup radioElect;


    private RadioButton radioButtonSober;
    private RadioButton radioButtonFeel;
    private RadioButton radioButtonSignal;
    private RadioButton radioButtonWhistle;
    private RadioButton radioButtonLooked;
    private RadioButton radioButtonReceipt;
    private RadioButton radioButtonCaution;
    private RadioButton radioButtonSpeed;
    private RadioButton radioButtonCalling;
    private RadioButton radioButtonPassage;
    private RadioButton radioButtonProcedure;
    private RadioButton radioButtonRound;
    private RadioButton radioButtonCoasting;
    private RadioButton radioButtonLog;
    private RadioButton radioButtonBraking;
    private RadioButton radioButtonRest;
    private RadioButton radioButtonUniform;
    private RadioButton radioButtonCug;
    private RadioButton radioButtonCommunication;
    private RadioButton radioButtonLoad1;
    private RadioButton radioButtonReadable;
    private RadioButton radioButtonFouling;
    private RadioButton radioButtonStoppage;
    private RadioButton radioButtonUnauthorised;
    private RadioButton radioButtonHabbit;
    private RadioButton radioButtonCab;
    private RadioButton radioButtonDefect;
    private RadioButton radioButtonElect;


    private Button btnDisplay1;
    private Button button8;


    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    public static final String Sober = "soberKey";
    public static final String Feel = "feelKey";
    public static final String Signal = "signalKey";
    public static final String Whistle = "whistleKey";
    public static final String Looked = "lookedKey";
    public static final String Receipt = "receiptKey";
    public static final String Caution = "cautionKey";
    public static final String Speed = "speedKey";
    public static final String Calling = "callingKey";
    public static final String Passage = "passageKey";
    public static final String Procedure = "procedureKey";
    public static final String Round = "roundKey";
    public static final String Coasting = "coastingKey";
    public static final String Log = "logKey";
    public static final String Braking = "brakingKey";
    public static final String Rest = "restKey";
    public static final String Uniform = "uniformKey";
    public static final String Cug = "cugKey";
    public static final String Communication = "communicationKey";
    int Load1;
    public static final String Readable = "readableKey";
    public static final String Fouling = "foulingKey";
    public static final String Stoppage = "stoppageKey";
    public static final String Unauthorised = "unauthorisedKey";
    public static final String Habit = "habitKey";
    public static final String Cab = "cabKey";
    public static final String Defect = "defectKey";
    public static final String Elect = "electKey";




    Context context;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crew_performance);
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

        si_spm = bundle.getString("si_spm");
        si_fl_afl = bundle.getString("si_fl_afl");
        si_head_light = bundle.getString("si_head_light");
        si_markerlight = bundle.getString("si_markerlight");
        si_afl = bundle.getString("si_afl");
        si_vcd = bundle.getString("si_vcd");
        si_horn = bundle.getString("si_horn");
        si_ssc = bundle.getString("si_ssc");
        si_shp_bp_fp = bundle.getString("si_shp_bp_fp");
        si_safety_u_clamp = bundle.getString("si_safety_u_clamp");
        si_fire_exting_no = bundle.getString("si_fire_exting_no");
        si_fire_exting_exp_date = bundle.getString("si_fire_exting_exp_date");
        si_hand_parking_brake = bundle.getString("si_hand_parking_brake");
        si_ww = bundle.getString("si_ww");
        si_spare_fuse = bundle.getString("si_spare_fuse");
        si_detonator_no = bundle.getString("si_detonator_no");
        si_detonator_validity = bundle.getString("si_detonator_validity");
        si_tricolor_torch = bundle.getString("si_tricolor_torch");
        si_red_green_flag = bundle.getString("si_red_green_flag");
        si_spare_spect = bundle.getString("si_spare_spect");

        cp_sober = bundle.getString("cp_sober");
        cp_lp_bp = bundle.getString("cp_lp_bp");
        cp_exchange_signal = bundle.getString("cp_exchange_signal");
        cp_whistled = bundle.getString("cp_whistled");
        cp_looked_back = bundle.getString("cp_looked_back");
        cp_proper_authority = bundle.getString("cp_proper_authority");
        cp_caution_order = bundle.getString("cp_caution_order");
        cp_max_permissible_speed = bundle.getString("cp_max_permissible_speed");
        cp_repeating_signal = bundle.getString("cp_repeating_signal");
        cp_adj_line = bundle.getString("cp_adj_line");
        cp_neutral_section = bundle.getString("cp_neutral_section");
        cp_alp_round = bundle.getString("cp_alp_round");
        cp_coasting = bundle.getString("cp_coasting");
        cp_logbook = bundle.getString("cp_logbook");
        cp_braking_techniques = bundle.getString("cp_braking_techniques");
        cp_rest = bundle.getString("cp_rest");
        cp_uniform = bundle.getString("cp_uniform");
        cp_cug_off = bundle.getString("cp_cug_off");
        cp_whf_communication = bundle.getString("cp_whf_communication");
        cp_load_brake = bundle.getString("cp_load_brake");
        cp_co_readable = bundle.getString("cp_co_readable");
        cp_foulingmark = bundle.getString("cp_foulingmark");
        cp_platform = bundle.getString("cp_platform");
        cp_unauthorised_person = bundle.getString("cp_unauthorised_person");
        cp_habit_unusual = bundle.getString("cp_habit_unusual");
        cp_alp_moisture = bundle.getString("cp_alp_moisture");
        cp_habit_cms = bundle.getString("cp_habit_cms");
        cp_dbr = bundle.getString("cp_dbr");




        radioSober =(RadioGroup)findViewById(R.id.radioSober);
        radioFeel =(RadioGroup)findViewById(R.id.radioFeel);
        radioSignal =(RadioGroup)findViewById(R.id.radioSignal);
        radioWhistle =(RadioGroup)findViewById(R.id.radioWhistle);
        radioLooked =(RadioGroup)findViewById(R.id.radioLooked);
        radioReceipt =(RadioGroup)findViewById(R.id.radioReceipt);
        radioCaution =(RadioGroup)findViewById(R.id.radioCaution);
        radioSpeed =(RadioGroup)findViewById(R.id.radioSpeed);
        radioCalling =(RadioGroup)findViewById(R.id.radioCalling);
        radioPassage =(RadioGroup)findViewById(R.id.radioPassage);
        radioProcedure =(RadioGroup)findViewById(R.id.radioProcedure);
        radioRound =(RadioGroup)findViewById(R.id.radioRound);
        radioCoasting =(RadioGroup)findViewById(R.id.radioCoasting);
        radioLog =(RadioGroup)findViewById(R.id.radioLog);
        radioBraking =(RadioGroup)findViewById(R.id.radioBraking);
        radioRest =(RadioGroup)findViewById(R.id.radioRest);
        radioUniform =(RadioGroup)findViewById(R.id.radioUniform);
        radioCug =(RadioGroup)findViewById(R.id.radioCug);
        radioCommunication =(RadioGroup)findViewById(R.id.radioCommunication);
        radioLoad1 =(RadioGroup)findViewById(R.id.radioLoad1);
        radioReadable =(RadioGroup)findViewById(R.id.radioReadable);
        radioFouling =(RadioGroup)findViewById(R.id.radioFouling);
        radioStoppage =(RadioGroup)findViewById(R.id.radioStoppage);
        radioUnauthorised =(RadioGroup)findViewById(R.id.radioUnauthorised);
        radioHabbit =(RadioGroup)findViewById(R.id.radioHabbit);
        radioCab =(RadioGroup)findViewById(R.id.radioCab);
        radioDefect =(RadioGroup)findViewById(R.id.radioDefect);
        radioElect =(RadioGroup)findViewById(R.id.radioElect);



        radioButtonSober = (RadioButton)findViewById(R.id.radioButtonSober);
        radioButtonFeel = (RadioButton)findViewById(R.id.radioButtonFeel);
        radioButtonSignal = (RadioButton)findViewById(R.id.radioButtonSignal);
        radioButtonWhistle = (RadioButton)findViewById(R.id.radioButtonWhistle);
        radioButtonLooked = (RadioButton)findViewById(R.id.radioButtonLooked);
        radioButtonReceipt = (RadioButton)findViewById(R.id.radioButtonReceipt);
        radioButtonCaution = (RadioButton)findViewById(R.id.radioButtonCaution);
        radioButtonSpeed = (RadioButton)findViewById(R.id.radioButtonSpeed);
        radioButtonCalling = (RadioButton)findViewById(R.id.radioButtonCalling);
        radioButtonPassage = (RadioButton)findViewById(R.id.radioButtonPassage);
        radioButtonProcedure = (RadioButton)findViewById(R.id.radioButtonProcedure);
        radioButtonRound = (RadioButton)findViewById(R.id.radioButtonRound);
        radioButtonCoasting = (RadioButton)findViewById(R.id.radioButtonCoasting);
        radioButtonLog = (RadioButton)findViewById(R.id.radioButtonLog);
        radioButtonBraking = (RadioButton)findViewById(R.id.radioButtonBraking);
        radioButtonRest = (RadioButton)findViewById(R.id.radioButtonRest);
        radioButtonUniform = (RadioButton)findViewById(R.id.radioButtonUniform);
        radioButtonCug = (RadioButton)findViewById(R.id.radioButtonCug);
        radioButtonCommunication = (RadioButton)findViewById(R.id.radioButtonCommunication);
        radioButtonLoad1 = (RadioButton)findViewById(R.id.radioButtonLoad1);
        radioButtonReadable = (RadioButton)findViewById(R.id.radioButtonReadable);
        radioButtonFouling = (RadioButton)findViewById(R.id.radioButtonFouling);
        radioButtonStoppage = (RadioButton)findViewById(R.id.radioButtonStoppage);
        radioButtonUnauthorised = (RadioButton)findViewById(R.id.radioButtonUnauthorised);
        radioButtonHabbit = (RadioButton)findViewById(R.id.radioButtonHabbit);
        radioButtonCab = (RadioButton)findViewById(R.id.radioButtonCab);
        radioButtonDefect = (RadioButton)findViewById(R.id.radioButtonDefect);
        radioButtonElect = (RadioButton)findViewById(R.id.radioButtonElect);



        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);


        radioSober.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener);
        radioFeel.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener1);
        radioSignal.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener2);
        radioWhistle.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener3);
        radioLooked.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener4);
        radioReceipt.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener5);
        radioCaution.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener6);
        radioSpeed.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener7);
        radioCalling.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener8);
        radioPassage.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener9);
        radioProcedure.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener10);
        radioRound.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener11);
        radioCoasting.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener12);
        radioLog.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener13);
        radioBraking.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener14);
        radioRest.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener15);
        radioUniform.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener16);
        radioCug.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener17);
        radioCommunication.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener18);
        radioLoad1.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener19);
        radioReadable.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener20);
        radioFouling.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener21);
        radioStoppage.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener22);
        radioUnauthorised.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener23);
        radioHabbit.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener24);
        radioCab.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener25);
        radioDefect.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener26);
        radioElect.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener27);


        button8 = (Button) findViewById(R.id.button8);
        button8.setEnabled(false);



        LoadPreferences();

        addListenerOnButton1();










    }






    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton = (RadioButton)radioSober.findViewById(checkedId);
                    int checkedIndex = radioSober.indexOfChild(checkedRadioButton);



                    SavePreferences(Sober, checkedIndex);



                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener1 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioFeel.findViewById(checkedId);
                    int checkedIndex1 = radioFeel.indexOfChild(checkedRadioButton1);



                    SavePreferences(Feel, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener2 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioSignal.findViewById(checkedId);
                    int checkedIndex1 = radioSignal.indexOfChild(checkedRadioButton1);



                    SavePreferences(Signal, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener3 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioWhistle.findViewById(checkedId);
                    int checkedIndex1 = radioWhistle.indexOfChild(checkedRadioButton1);



                    SavePreferences(Whistle, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener4 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioLooked.findViewById(checkedId);
                    int checkedIndex1 = radioLooked.indexOfChild(checkedRadioButton1);



                    SavePreferences(Looked, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener5 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioReceipt.findViewById(checkedId);
                    int checkedIndex1 = radioReceipt.indexOfChild(checkedRadioButton1);



                    SavePreferences(Receipt, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener6 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioCaution.findViewById(checkedId);
                    int checkedIndex1 = radioCaution.indexOfChild(checkedRadioButton1);



                    SavePreferences(Caution, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener7 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioSpeed.findViewById(checkedId);
                    int checkedIndex1 = radioSpeed.indexOfChild(checkedRadioButton1);



                    SavePreferences(Speed, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener8 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioCalling.findViewById(checkedId);
                    int checkedIndex1 = radioCalling.indexOfChild(checkedRadioButton1);



                    SavePreferences(Calling, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener9 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioPassage.findViewById(checkedId);
                    int checkedIndex1 = radioPassage.indexOfChild(checkedRadioButton1);



                    SavePreferences(Passage, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener10 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioProcedure.findViewById(checkedId);
                    int checkedIndex1 = radioProcedure.indexOfChild(checkedRadioButton1);



                    SavePreferences(Procedure, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener11 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioRound.findViewById(checkedId);
                    int checkedIndex1 = radioRound.indexOfChild(checkedRadioButton1);



                    SavePreferences(Round, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener12 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioCoasting.findViewById(checkedId);
                    int checkedIndex1 = radioCoasting.indexOfChild(checkedRadioButton1);



                    SavePreferences(Coasting, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener13 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioLog.findViewById(checkedId);
                    int checkedIndex1 = radioLog.indexOfChild(checkedRadioButton1);



                    SavePreferences(Log, checkedIndex1);

                }};



    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener14 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton = (RadioButton)radioBraking.findViewById(checkedId);
                    int checkedIndex = radioBraking.indexOfChild(checkedRadioButton);



                    SavePreferences(Braking, checkedIndex);



                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener15 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioRest.findViewById(checkedId);
                    int checkedIndex1 = radioRest.indexOfChild(checkedRadioButton1);



                    SavePreferences(Rest, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener16 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioUniform.findViewById(checkedId);
                    int checkedIndex1 = radioUniform.indexOfChild(checkedRadioButton1);



                    SavePreferences(Uniform, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener17 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioCug.findViewById(checkedId);
                    int checkedIndex1 = radioCug.indexOfChild(checkedRadioButton1);



                    SavePreferences(Cug, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener18 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioCommunication.findViewById(checkedId);
                    int checkedIndex1 = radioCommunication.indexOfChild(checkedRadioButton1);



                    SavePreferences(Communication, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener19 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioLoad1.findViewById(checkedId);
                    int checkedIndex1 = radioLoad1.indexOfChild(checkedRadioButton1);



                    SavePreferences(String.valueOf(Load1), checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener20 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioReadable.findViewById(checkedId);
                    int checkedIndex1 = radioReadable.indexOfChild(checkedRadioButton1);



                    SavePreferences(Readable, checkedIndex1);

                }};

    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener21 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioFouling.findViewById(checkedId);
                    int checkedIndex1 = radioFouling.indexOfChild(checkedRadioButton1);



                    SavePreferences(Fouling, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener22 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioStoppage.findViewById(checkedId);
                    int checkedIndex1 = radioStoppage.indexOfChild(checkedRadioButton1);



                    SavePreferences(Stoppage, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener23 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioUnauthorised.findViewById(checkedId);
                    int checkedIndex1 = radioUnauthorised.indexOfChild(checkedRadioButton1);



                    SavePreferences(Unauthorised, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener24 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioHabbit.findViewById(checkedId);
                    int checkedIndex1 = radioHabbit.indexOfChild(checkedRadioButton1);



                    SavePreferences(Habit, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener25 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioCab.findViewById(checkedId);
                    int checkedIndex1 = radioCab.indexOfChild(checkedRadioButton1);



                    SavePreferences(Cab, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener26 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioDefect.findViewById(checkedId);
                    int checkedIndex1 = radioDefect.indexOfChild(checkedRadioButton1);



                    SavePreferences(Defect, checkedIndex1);

                }};


    RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener27 =
            new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    RadioButton checkedRadioButton1 = (RadioButton)radioElect.findViewById(checkedId);
                    int checkedIndex1 = radioElect.indexOfChild(checkedRadioButton1);



                    SavePreferences(Elect, checkedIndex1);

                }};




    private void SavePreferences(String key, int value){
        getSharedPreferences("soberKey", MODE_PRIVATE);
        getSharedPreferences("feelKey", MODE_PRIVATE);
        getSharedPreferences("signalKey", MODE_PRIVATE);
        getSharedPreferences("whistleKey", MODE_PRIVATE);
        getSharedPreferences("lookedKey", MODE_PRIVATE);
        getSharedPreferences("receiptKey", MODE_PRIVATE);
        getSharedPreferences("cautionKey", MODE_PRIVATE);
        getSharedPreferences("speedKey", MODE_PRIVATE);
        getSharedPreferences("callingKey", MODE_PRIVATE);
        getSharedPreferences("passageKey", MODE_PRIVATE);
        getSharedPreferences("procedureKey", MODE_PRIVATE);
        getSharedPreferences("roundKey", MODE_PRIVATE);
        getSharedPreferences("coastingKey", MODE_PRIVATE);
        getSharedPreferences("logKey", MODE_PRIVATE);
        getSharedPreferences("brakingKey", MODE_PRIVATE);
        getSharedPreferences("restKey", MODE_PRIVATE);
        getSharedPreferences("uniformKey", MODE_PRIVATE);
        getSharedPreferences("cugKey", MODE_PRIVATE);
        getSharedPreferences("communicationKey", MODE_PRIVATE);
        getSharedPreferences("loadKey", MODE_PRIVATE);
        getSharedPreferences("readableKey", MODE_PRIVATE);
        getSharedPreferences("foulingKey", MODE_PRIVATE);
        getSharedPreferences("stoppageKey", MODE_PRIVATE);
        getSharedPreferences("unauthorisedKey", MODE_PRIVATE);
        getSharedPreferences("habitKey", MODE_PRIVATE);
        getSharedPreferences("cabKey", MODE_PRIVATE);
        getSharedPreferences("defectKey", MODE_PRIVATE);
        getSharedPreferences("electKey", MODE_PRIVATE);


        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }




    private void LoadPreferences(){
        getSharedPreferences("mypref", MODE_PRIVATE);

        int savedRadioIndex = sharedpreferences.getInt(Sober, 0);
        RadioButton savedCheckedRadioButton = (RadioButton)radioSober.getChildAt(savedRadioIndex);
        savedCheckedRadioButton.setChecked(true);

        int savedRadioIndex1 = sharedpreferences.getInt(Feel, 0);
        RadioButton savedCheckedRadioButton1 = (RadioButton)radioFeel.getChildAt(savedRadioIndex1);
        savedCheckedRadioButton1.setChecked(true);

        int savedRadioIndex2 = sharedpreferences.getInt(Signal, 0);
        RadioButton savedCheckedRadioButton2 = (RadioButton)radioSignal.getChildAt(savedRadioIndex2);
        savedCheckedRadioButton2.setChecked(true);

        int savedRadioIndex3 = sharedpreferences.getInt(Whistle, 0);
        RadioButton savedCheckedRadioButton3 = (RadioButton)radioWhistle.getChildAt(savedRadioIndex3);
        savedCheckedRadioButton3.setChecked(true);

        int savedRadioIndex4 = sharedpreferences.getInt(Looked, 0);
        RadioButton savedCheckedRadioButton4 = (RadioButton)radioLooked.getChildAt(savedRadioIndex4);
        savedCheckedRadioButton4.setChecked(true);

        int savedRadioIndex5 = sharedpreferences.getInt(Receipt, 0);
        RadioButton savedCheckedRadioButton5 = (RadioButton)radioReceipt.getChildAt(savedRadioIndex5);
        savedCheckedRadioButton5.setChecked(true);

        int savedRadioIndex6 = sharedpreferences.getInt(Caution, 0);
        RadioButton savedCheckedRadioButton6 = (RadioButton)radioCaution.getChildAt(savedRadioIndex6);
        savedCheckedRadioButton6.setChecked(true);

        int savedRadioIndex7 = sharedpreferences.getInt(Speed, 0);
        RadioButton savedCheckedRadioButton7 = (RadioButton)radioSpeed.getChildAt(savedRadioIndex7);
        savedCheckedRadioButton7.setChecked(true);

        int savedRadioIndex8 = sharedpreferences.getInt(Calling, 0);
        RadioButton savedCheckedRadioButton8 = (RadioButton)radioCalling.getChildAt(savedRadioIndex8);
        savedCheckedRadioButton8.setChecked(true);

        int savedRadioIndex9 = sharedpreferences.getInt(Passage, 0);
        RadioButton savedCheckedRadioButton9 = (RadioButton)radioPassage.getChildAt(savedRadioIndex9);
        savedCheckedRadioButton9.setChecked(true);

        int savedRadioIndex10 = sharedpreferences.getInt(Procedure, 0);
        RadioButton savedCheckedRadioButton10 = (RadioButton)radioProcedure.getChildAt(savedRadioIndex10);
        savedCheckedRadioButton10.setChecked(true);

        int savedRadioIndex11 = sharedpreferences.getInt(Round, 0);
        RadioButton savedCheckedRadioButton11 = (RadioButton)radioRound.getChildAt(savedRadioIndex11);
        savedCheckedRadioButton11.setChecked(true);

        int savedRadioIndex12 = sharedpreferences.getInt(Coasting, 0);
        RadioButton savedCheckedRadioButton12 = (RadioButton)radioCoasting.getChildAt(savedRadioIndex12);
        savedCheckedRadioButton12.setChecked(true);

        int savedRadioIndex13 = sharedpreferences.getInt(Log, 0);
        RadioButton savedCheckedRadioButton13 = (RadioButton)radioLog.getChildAt(savedRadioIndex13);
        savedCheckedRadioButton13.setChecked(true);

        int savedRadioIndex14 = sharedpreferences.getInt(Braking, 0);
        RadioButton savedCheckedRadioButton14 = (RadioButton)radioBraking.getChildAt(savedRadioIndex14);
        savedCheckedRadioButton14.setChecked(true);

        int savedRadioIndex15 = sharedpreferences.getInt(Rest, 0);
        RadioButton savedCheckedRadioButton15 = (RadioButton)radioRest.getChildAt(savedRadioIndex15);
        savedCheckedRadioButton15.setChecked(true);

        int savedRadioIndex16 = sharedpreferences.getInt(Uniform, 0);
        RadioButton savedCheckedRadioButton16 = (RadioButton)radioUniform.getChildAt(savedRadioIndex16);
        savedCheckedRadioButton16.setChecked(true);

        int savedRadioIndex17 = sharedpreferences.getInt(Cug, 0);
        RadioButton savedCheckedRadioButton17 = (RadioButton)radioCug.getChildAt(savedRadioIndex17);
        savedCheckedRadioButton17.setChecked(true);

        int savedRadioIndex18 = sharedpreferences.getInt(Communication, 0);
        RadioButton savedCheckedRadioButton18 = (RadioButton)radioCommunication.getChildAt(savedRadioIndex18);
        savedCheckedRadioButton18.setChecked(true);

        int savedRadioIndex19 = sharedpreferences.getInt(String.valueOf(Load1), 0);
        RadioButton savedCheckedRadioButton19 = (RadioButton)radioLoad1.getChildAt(savedRadioIndex19);
        savedCheckedRadioButton19.setChecked(true);

        int savedRadioIndex20 = sharedpreferences.getInt(Readable, 0);
        RadioButton savedCheckedRadioButton20 = (RadioButton)radioReadable.getChildAt(savedRadioIndex20);
        savedCheckedRadioButton20.setChecked(true);

        int savedRadioIndex21 = sharedpreferences.getInt(Fouling, 0);
        RadioButton savedCheckedRadioButton21 = (RadioButton)radioFouling.getChildAt(savedRadioIndex21);
        savedCheckedRadioButton21.setChecked(true);

        int savedRadioIndex22 = sharedpreferences.getInt(Stoppage, 0);
        RadioButton savedCheckedRadioButton22 = (RadioButton)radioStoppage.getChildAt(savedRadioIndex22);
        savedCheckedRadioButton22.setChecked(true);

        int savedRadioIndex23 = sharedpreferences.getInt(Unauthorised, 0);
        RadioButton savedCheckedRadioButton23 = (RadioButton)radioUnauthorised.getChildAt(savedRadioIndex23);
        savedCheckedRadioButton23.setChecked(true);

        int savedRadioIndex24 = sharedpreferences.getInt(Habit, 0);
        RadioButton savedCheckedRadioButton24 = (RadioButton)radioHabbit.getChildAt(savedRadioIndex24);
        savedCheckedRadioButton24.setChecked(true);

        int savedRadioIndex25 = sharedpreferences.getInt(Cab, 0);
        RadioButton savedCheckedRadioButton25 = (RadioButton)radioCab.getChildAt(savedRadioIndex25);
        savedCheckedRadioButton25.setChecked(true);

        int savedRadioIndex26 = sharedpreferences.getInt(Defect, 0);
        RadioButton savedCheckedRadioButton26 = (RadioButton)radioDefect.getChildAt(savedRadioIndex26);
        savedCheckedRadioButton26.setChecked(true);

        int savedRadioIndex27 = sharedpreferences.getInt(Elect, 0);
        RadioButton savedCheckedRadioButton27 = (RadioButton)radioElect.getChildAt(savedRadioIndex27);
        savedCheckedRadioButton27.setChecked(true);





    }



    public void addListenerOnButton1() {



        radioSober =(RadioGroup)findViewById(R.id.radioSober);
        radioFeel =(RadioGroup)findViewById(R.id.radioFeel);
        radioSignal =(RadioGroup)findViewById(R.id.radioSignal);
        radioWhistle =(RadioGroup)findViewById(R.id.radioWhistle);
        radioLooked =(RadioGroup)findViewById(R.id.radioLooked);
        radioReceipt =(RadioGroup)findViewById(R.id.radioReceipt);
        radioCaution =(RadioGroup)findViewById(R.id.radioCaution);
        radioSpeed =(RadioGroup)findViewById(R.id.radioSpeed);
        radioCalling =(RadioGroup)findViewById(R.id.radioCalling);
        radioPassage =(RadioGroup)findViewById(R.id.radioPassage);
        radioProcedure =(RadioGroup)findViewById(R.id.radioProcedure);
        radioRound =(RadioGroup)findViewById(R.id.radioRound);
        radioCoasting =(RadioGroup)findViewById(R.id.radioCoasting);
        radioLog =(RadioGroup)findViewById(R.id.radioLog);
        radioBraking =(RadioGroup)findViewById(R.id.radioBraking);
        radioRest =(RadioGroup)findViewById(R.id.radioRest);
        radioUniform =(RadioGroup)findViewById(R.id.radioUniform);
        radioCug =(RadioGroup)findViewById(R.id.radioCug);
        radioCommunication =(RadioGroup)findViewById(R.id.radioCommunication);
        radioLoad1 =(RadioGroup)findViewById(R.id.radioLoad1);
        radioReadable =(RadioGroup)findViewById(R.id.radioReadable);
        radioFouling =(RadioGroup)findViewById(R.id.radioFouling);
        radioStoppage =(RadioGroup)findViewById(R.id.radioStoppage);
        radioUnauthorised =(RadioGroup)findViewById(R.id.radioUnauthorised);
        radioHabbit =(RadioGroup)findViewById(R.id.radioHabbit);
        radioCab =(RadioGroup)findViewById(R.id.radioCab);
        radioDefect =(RadioGroup)findViewById(R.id.radioDefect);
        radioElect =(RadioGroup)findViewById(R.id.radioElect);




        btnDisplay1 = (Button) findViewById(R.id.btnDisplay1);




        btnDisplay1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioSober.getCheckedRadioButtonId();
                int selectedId1 = radioFeel.getCheckedRadioButtonId();
                int selectedId2 = radioSignal.getCheckedRadioButtonId();
                int selectedId3 = radioWhistle.getCheckedRadioButtonId();
                int selectedId4 = radioLooked.getCheckedRadioButtonId();
                int selectedId5 = radioReceipt.getCheckedRadioButtonId();
                int selectedId6 = radioCaution.getCheckedRadioButtonId();
                int selectedId7 = radioSpeed.getCheckedRadioButtonId();
                int selectedId8 = radioCalling.getCheckedRadioButtonId();
                int selectedId9 = radioPassage.getCheckedRadioButtonId();
                int selectedId10 = radioProcedure.getCheckedRadioButtonId();
                int selectedId11 = radioRound.getCheckedRadioButtonId();
                int selectedId12 = radioCoasting.getCheckedRadioButtonId();
                int selectedId13 = radioLog.getCheckedRadioButtonId();
                int selectedId14 = radioBraking.getCheckedRadioButtonId();
                int selectedId15 = radioRest.getCheckedRadioButtonId();
                int selectedId16 = radioUniform.getCheckedRadioButtonId();
                int selectedId17 = radioCug.getCheckedRadioButtonId();
                int selectedId18 = radioCommunication.getCheckedRadioButtonId();
                int selectedId19 = radioLoad1.getCheckedRadioButtonId();
                int selectedId20 = radioReadable.getCheckedRadioButtonId();
                int selectedId21 = radioFouling.getCheckedRadioButtonId();
                int selectedId22 = radioStoppage.getCheckedRadioButtonId();
                int selectedId23 = radioUnauthorised.getCheckedRadioButtonId();
                int selectedId24 = radioHabbit.getCheckedRadioButtonId();
                int selectedId25 = radioCab.getCheckedRadioButtonId();
                int selectedId26 = radioDefect.getCheckedRadioButtonId();
                int selectedId27 = radioElect.getCheckedRadioButtonId();



                // find the radiobutton by returned id
                radioButtonSober = (RadioButton) findViewById(selectedId);
                radioButtonFeel = (RadioButton) findViewById(selectedId1);
                radioButtonSignal = (RadioButton) findViewById(selectedId2);
                radioButtonWhistle = (RadioButton) findViewById(selectedId3);
                radioButtonLooked = (RadioButton) findViewById(selectedId4);
                radioButtonReceipt = (RadioButton) findViewById(selectedId5);
                radioButtonCaution = (RadioButton) findViewById(selectedId6);
                radioButtonSpeed = (RadioButton) findViewById(selectedId7);
                radioButtonCalling = (RadioButton) findViewById(selectedId8);
                radioButtonPassage = (RadioButton) findViewById(selectedId9);
                radioButtonProcedure = (RadioButton) findViewById(selectedId10);
                radioButtonRound = (RadioButton) findViewById(selectedId11);
                radioButtonCoasting = (RadioButton) findViewById(selectedId12);
                radioButtonLog = (RadioButton) findViewById(selectedId13);
                radioButtonBraking = (RadioButton) findViewById(selectedId14);
                radioButtonRest = (RadioButton) findViewById(selectedId15);
                radioButtonUniform = (RadioButton) findViewById(selectedId16);
                radioButtonCug = (RadioButton) findViewById(selectedId17);
                radioButtonCommunication = (RadioButton) findViewById(selectedId18);
                radioButtonLoad1 = (RadioButton) findViewById(selectedId19);
                radioButtonReadable = (RadioButton) findViewById(selectedId20);
                radioButtonFouling = (RadioButton) findViewById(selectedId21);
                radioButtonStoppage = (RadioButton) findViewById(selectedId22);
                radioButtonUnauthorised = (RadioButton) findViewById(selectedId23);
                radioButtonHabbit = (RadioButton) findViewById(selectedId24);
                radioButtonCab = (RadioButton) findViewById(selectedId25);
                radioButtonDefect = (RadioButton) findViewById(selectedId26);
                radioButtonElect = (RadioButton) findViewById(selectedId27);






//                Toast.makeText(SafetyItems.this,
//                        radioButton.getText(), Toast.LENGTH_SHORT).show();
//                Toast.makeText(SafetyItems.this,
//                        radioButtonflal.getText(), Toast.LENGTH_SHORT).show();

                cp_sober = radioButtonSober.getText().toString();
                cp_lp_bp = radioButtonFeel.getText().toString();
                cp_exchange_signal = radioButtonSignal.getText().toString();
                cp_whistled = radioButtonWhistle.getText().toString();
                cp_looked_back = radioButtonLooked.getText().toString();
                cp_proper_authority = radioButtonReceipt.getText().toString();
                cp_caution_order = radioButtonCaution.getText().toString();
                cp_max_permissible_speed = radioButtonSpeed.getText().toString();
                cp_repeating_signal = radioButtonCalling.getText().toString();
                cp_adj_line = radioButtonPassage.getText().toString();
                cp_neutral_section = radioButtonProcedure.getText().toString();
                cp_alp_round = radioButtonRound.getText().toString();
                cp_coasting = radioButtonCoasting.getText().toString();
                cp_logbook = radioButtonLog.getText().toString();
                cp_braking_techniques  = radioButtonBraking.getText().toString();
                cp_rest = radioButtonRest.getText().toString();
                cp_uniform = radioButtonUniform.getText().toString();
                cp_cug_off = radioButtonCug.getText().toString();
                cp_whf_communication = radioButtonCommunication.getText().toString();
                cp_load_brake = radioButtonLoad1.getText().toString();
                cp_co_readable = radioButtonReadable.getText().toString();
                cp_foulingmark = radioButtonFouling.getText().toString();
                cp_platform = radioButtonStoppage.getText().toString();
                cp_unauthorised_person = radioButtonUnauthorised.getText().toString();
                cp_habit_unusual = radioButtonHabbit.getText().toString();
                cp_alp_moisture = radioButtonCab.getText().toString();
                cp_habit_cms = radioButtonDefect.getText().toString();
                cp_dbr = radioButtonElect.getText().toString();




                Toast toast = Toast.makeText(getApplicationContext(), "Saved on phone", Toast.LENGTH_SHORT);
                toast.show();

                button8.setEnabled(true);

            }

        });


    }




    public void sendMessage3(View view)
    {
        Intent intent = new Intent(CrewPerformance.this, Other.class);

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


        intent.putExtra("cp_sober",cp_sober);
        intent.putExtra("cp_lp_bp",cp_lp_bp);
        intent.putExtra("cp_exchange_signal",cp_exchange_signal);
        intent.putExtra("cp_whistled",cp_whistled);
        intent.putExtra("cp_looked_back",cp_looked_back);
        intent.putExtra("cp_proper_authority",cp_proper_authority);
        intent.putExtra("cp_caution_order",cp_caution_order);
        intent.putExtra("cp_max_permissible_speed",cp_max_permissible_speed);
        intent.putExtra("cp_repeating_signal",cp_repeating_signal);
        intent.putExtra("cp_adj_line",cp_adj_line);
        intent.putExtra("cp_neutral_section",cp_neutral_section);
        intent.putExtra("cp_alp_round",cp_alp_round);
        intent.putExtra("cp_coasting",cp_coasting);
        intent.putExtra("cp_logbook",cp_logbook);
        intent.putExtra("cp_braking_techniques",cp_braking_techniques);
        intent.putExtra("cp_rest",cp_rest);
        intent.putExtra("cp_uniform",cp_uniform);
        intent.putExtra("cp_cug_off",cp_cug_off);
        intent.putExtra("cp_whf_communication",cp_whf_communication);
        intent.putExtra("cp_load_brake",cp_load_brake);
        intent.putExtra("cp_co_readable",cp_co_readable);
        intent.putExtra("cp_foulingmark",cp_foulingmark);
        intent.putExtra("cp_platform",cp_platform);
        intent.putExtra("cp_unauthorised_person",cp_unauthorised_person);
        intent.putExtra("cp_habit_unusual",cp_habit_unusual);
        intent.putExtra("cp_alp_moisture",cp_alp_moisture);
        intent.putExtra("cp_habit_cms",cp_habit_cms);
        intent.putExtra("cp_dbr",cp_dbr);



        startActivity(intent);
    }













}



