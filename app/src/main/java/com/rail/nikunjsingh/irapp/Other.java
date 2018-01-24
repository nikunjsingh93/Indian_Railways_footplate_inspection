package com.rail.nikunjsingh.irapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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


public class Other extends AppCompatActivity {

    private EditText editTextNature;
    private EditText editTextAction;
    private Button button101;

    SharedPreferences sharedpreferences;

    public static final String mypreference = "mypref";
    public static final String Nature = "natureKey";
    public static final String Action = "actionKey";

    Context context;

    public String oth_irregularity;
    public String oth_actions;


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





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
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



        editTextNature = (EditText) findViewById(R.id.editTextNature);
        editTextAction = (EditText) findViewById(R.id.editTextAction);


        button101 = (Button) findViewById(R.id.button101);
        button101.setEnabled(false);


        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Nature)) {
            editTextNature.setText(sharedpreferences.getString(Nature, ""));
        }

        if (sharedpreferences.contains(Action)) {
            editTextAction.setText(sharedpreferences.getString(Action, ""));
        }







    }

    public void Save4(View view) {

        button101.setEnabled(true);

        oth_irregularity = editTextNature.getText().toString();
        oth_actions = editTextAction.getText().toString();




        SharedPreferences.Editor editor = sharedpreferences.edit();


        editor.putString(Nature, oth_irregularity);
        editor.putString(Action, oth_actions);




        editor.commit();

        Toast toast = Toast.makeText(getApplicationContext(), "Saved on phone", Toast.LENGTH_SHORT);
        toast.show();



    }


    public void sendMessage4(View view)
    {
        Intent intent = new Intent(Other.this, Sync.class);

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




        intent.putExtra("oth_irregularity",oth_irregularity);
        intent.putExtra("oth_actions",oth_actions);




        startActivity(intent);
    }






}
