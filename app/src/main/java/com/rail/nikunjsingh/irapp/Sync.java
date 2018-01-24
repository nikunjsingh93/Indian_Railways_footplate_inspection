package com.rail.nikunjsingh.irapp;

import android.content.Context;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

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
import java.util.List;

public class Sync extends AppCompatActivity  {


    Context context;

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

    public String oth_irregularity;
    public String oth_actions;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync);
        context = this.getApplication();



    }

//    public void Get(View view) {
//        editTextName = (EditText) findViewById(R.id.editTextName);
//
//        sharedpreferences = getSharedPreferences(mypreference,
//                Context.MODE_PRIVATE);
//
//        if (sharedpreferences.contains(Name)) {
//            editTextName.setText(sharedpreferences.getString(Name, ""));
//        }
//
//    }

    public void insert(View view){


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

        oth_irregularity = bundle.getString("oth_irregularity");
        oth_actions = bundle.getString("oth_actions");









        insertToDatabase(name,unit,loco,insp_date,designation,department,bpc_date,train_no,from_depart,to_arrive,load_no,
                bpbf_pressure,bpc_no,punct_details,h_o,sch_details,crew_lp_name,crew_alp_name,crew_lp_pme_done_dt,crew_lp_pme_due_dt,
                crew_alp_pme_done_dt,crew_alp_pme_due_dt,crew_lp_ref_done_dt,crew_lp_ref_due_dt,crew_alp_ref_done_dt,crew_alp_ref_due_dt,
                crew_lp_abs_done_dt,crew_lp_abs_due_dt,crew_alp_abs_done_dt,crew_alp_abs_due_dt,crew_lp_driving_compt,crew_alp_driving_compt,
                crew_lp_nominated_li,crew_alp_nominated_li,crew_lp_last_monitoring_nli,crew_alp_last_monitoring_nli,crew_lp_psycho_date,
                crew_alp_psycho_date,crew_lp_safety_date,crew_alp_safety_date,si_spm,si_fl_afl,si_head_light,si_markerlight,si_afl,si_vcd,
                si_horn,si_ssc,si_shp_bp_fp,si_safety_u_clamp,si_fire_exting_no,si_fire_exting_exp_date,si_hand_parking_brake,si_ww,
                si_spare_fuse,si_detonator_no,si_detonator_validity,si_tricolor_torch,si_red_green_flag,si_spare_spect,cp_sober,cp_lp_bp,
                cp_exchange_signal,cp_whistled,cp_looked_back,cp_proper_authority,cp_caution_order,cp_max_permissible_speed,cp_repeating_signal,
                cp_adj_line,cp_neutral_section,cp_alp_round,cp_coasting,cp_logbook,cp_braking_techniques,cp_rest,cp_uniform,cp_cug_off,
                cp_whf_communication,cp_load_brake,cp_co_readable,cp_foulingmark,cp_platform,cp_unauthorised_person,cp_habit_unusual,cp_alp_moisture,
                cp_habit_cms,cp_dbr,oth_irregularity,oth_actions);

    }



    public void insertToDatabase(final String name, final String unit, final String loco, final  String insp_date,
                                 final String designation, final String department, final String bpc_date, final String train_no,
                                  final String from_depart, final String to_arrive, final String load_no, final String bpbf_pressure,
                                  final String bpc_no, final String punct_details, final String h_o, final String sch_details,
                                  final String crew_lp_name, final  String crew_alp_name, final String crew_lp_pme_done_dt,
                                 final String crew_lp_pme_due_dt,final String crew_alp_pme_done_dt, final String crew_alp_pme_due_dt,
                                 final String crew_lp_ref_done_dt, final String crew_lp_ref_due_dt, final String crew_alp_ref_done_dt,
                                 final String crew_alp_ref_due_dt, final String crew_lp_abs_done_dt, final String crew_lp_abs_due_dt,
                                 final String crew_alp_abs_done_dt, final String crew_alp_abs_due_dt, final String crew_lp_driving_compt,
                                 final String crew_alp_driving_compt, final String crew_lp_nominated_li, final String crew_alp_nominated_li,
                                 final String crew_lp_last_monitoring_nli, final String crew_alp_last_monitoring_nli,
                                 final String crew_lp_psycho_date, final String crew_alp_psycho_date, final String crew_lp_safety_date,
                                 final String crew_alp_safety_date, final String si_spm, final  String si_fl_afl, final String si_head_light,
                                 final String si_markerlight, final String si_afl, final String si_vcd, final String si_horn,
                                 final String si_ssc, final String si_shp_bp_fp, final String si_safety_u_clamp, final String si_fire_exting_no,
                                 final String si_fire_exting_exp_date, final String si_hand_parking_brake, final String si_ww,
                                 final String si_spare_fuse, final String si_detonator_no, final String si_detonator_validity,
                                 final String si_tricolor_torch, final String si_red_green_flag, final String si_spare_spect,
                                 final String cp_sober, final  String cp_lp_bp, final String cp_exchange_signal,
                                 final String cp_whistled, final String cp_looked_back, final String cp_proper_authority,
                                 final String cp_caution_order, final String cp_max_permissible_speed, final String cp_repeating_signal,
                                 final String cp_adj_line, final String cp_neutral_section, final String cp_alp_round, final String cp_coasting,
                                 final String cp_logbook, final String cp_braking_techniques, final  String cp_rest, final String cp_uniform,
                                 final String cp_cug_off, final String cp_whf_communication, final String cp_load_brake, final String cp_co_readable,
                                 final String cp_foulingmark, final String cp_platform, final String cp_unauthorised_person, final String cp_habit_unusual,
                                 final String cp_alp_moisture, final String cp_habit_cms, final String cp_dbr, final String oth_irregularity,
                                 final String oth_actions){
        class SendPostReqAsyncTask extends AsyncTask<String, Void, String> {
            @Override
            protected String doInBackground(String... params) {

                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                nameValuePairs.add(new BasicNameValuePair("name", name));
                nameValuePairs.add(new BasicNameValuePair("unit", unit));
                nameValuePairs.add(new BasicNameValuePair("loco", loco));
                nameValuePairs.add(new BasicNameValuePair("insp_date", insp_date));
                nameValuePairs.add(new BasicNameValuePair("designation", designation));
                nameValuePairs.add(new BasicNameValuePair("department", department));
                nameValuePairs.add(new BasicNameValuePair("bpc_date", bpc_date));
                nameValuePairs.add(new BasicNameValuePair("train_no", train_no));
                nameValuePairs.add(new BasicNameValuePair("from_depart", from_depart));
                nameValuePairs.add(new BasicNameValuePair("to_arrive", to_arrive));
                nameValuePairs.add(new BasicNameValuePair("load_no", load_no));
                nameValuePairs.add(new BasicNameValuePair("bpbf_pressure", bpbf_pressure));
                nameValuePairs.add(new BasicNameValuePair("bpc_no", bpc_no));
                nameValuePairs.add(new BasicNameValuePair("punct_details", punct_details));
                nameValuePairs.add(new BasicNameValuePair("h_o", h_o));
                nameValuePairs.add(new BasicNameValuePair("sch_details", sch_details));

                nameValuePairs.add(new BasicNameValuePair("crew_lp_name", crew_lp_name));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_name", crew_alp_name));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_pme_done_dt", crew_lp_pme_done_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_pme_due_dt", crew_lp_pme_due_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_pme_done_dt", crew_alp_pme_done_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_pme_due_dt", crew_alp_pme_due_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_ref_done_dt", crew_lp_ref_done_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_ref_due_dt", crew_lp_ref_due_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_ref_done_dt", crew_alp_ref_done_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_ref_due_dt", crew_alp_ref_due_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_abs_done_dt", crew_lp_abs_done_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_abs_due_dt", crew_lp_abs_due_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_abs_done_dt", crew_alp_abs_done_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_abs_due_dt", crew_alp_abs_due_dt));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_driving_compt", crew_lp_driving_compt));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_driving_compt", crew_alp_driving_compt));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_nominated_li", crew_lp_nominated_li));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_nominated_li", crew_alp_nominated_li));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_last_monitoring_nli", crew_lp_last_monitoring_nli));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_last_monitoring_nli", crew_alp_last_monitoring_nli));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_psycho_date", crew_lp_psycho_date));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_psycho_date", crew_alp_psycho_date));
                nameValuePairs.add(new BasicNameValuePair("crew_lp_safety_date", crew_lp_safety_date));
                nameValuePairs.add(new BasicNameValuePair("crew_alp_safety_date", crew_alp_safety_date));

                nameValuePairs.add(new BasicNameValuePair("si_spm", si_spm));
                nameValuePairs.add(new BasicNameValuePair("si_fl_afl", si_fl_afl));
                nameValuePairs.add(new BasicNameValuePair("si_head_light", si_head_light));
                nameValuePairs.add(new BasicNameValuePair("si_markerlight", si_markerlight));
                nameValuePairs.add(new BasicNameValuePair("si_afl", si_afl));
                nameValuePairs.add(new BasicNameValuePair("si_vcd", si_vcd));
                nameValuePairs.add(new BasicNameValuePair("si_horn", si_horn));
                nameValuePairs.add(new BasicNameValuePair("si_ssc", si_ssc));
                nameValuePairs.add(new BasicNameValuePair("si_shp_bp_fp", si_shp_bp_fp));
                nameValuePairs.add(new BasicNameValuePair("si_safety_u_clamp", si_safety_u_clamp));
                nameValuePairs.add(new BasicNameValuePair("si_fire_exting_no", si_fire_exting_no));
                nameValuePairs.add(new BasicNameValuePair("si_fire_exting_exp_date", si_fire_exting_exp_date));
                nameValuePairs.add(new BasicNameValuePair("si_hand_parking_brake", si_hand_parking_brake));
                nameValuePairs.add(new BasicNameValuePair("si_ww", si_ww));
                nameValuePairs.add(new BasicNameValuePair("si_spare_fuse", si_spare_fuse));
                nameValuePairs.add(new BasicNameValuePair("si_detonator_no", si_detonator_no));
                nameValuePairs.add(new BasicNameValuePair("si_detonator_validity", si_detonator_validity));
                nameValuePairs.add(new BasicNameValuePair("si_tricolor_torch", si_tricolor_torch));
                nameValuePairs.add(new BasicNameValuePair("si_red_green_flag", si_red_green_flag));
                nameValuePairs.add(new BasicNameValuePair("si_spare_spect", si_spare_spect));


                nameValuePairs.add(new BasicNameValuePair("cp_sober", cp_sober));
                nameValuePairs.add(new BasicNameValuePair("cp_lp_bp", cp_lp_bp));
                nameValuePairs.add(new BasicNameValuePair("cp_exchange_signal", cp_exchange_signal));
                nameValuePairs.add(new BasicNameValuePair("cp_whistled", cp_whistled));
                nameValuePairs.add(new BasicNameValuePair("cp_looked_back", cp_looked_back));
                nameValuePairs.add(new BasicNameValuePair("cp_proper_authority", cp_proper_authority));
                nameValuePairs.add(new BasicNameValuePair("cp_caution_order", cp_caution_order));
                nameValuePairs.add(new BasicNameValuePair("cp_max_permissible_speed", cp_max_permissible_speed));
                nameValuePairs.add(new BasicNameValuePair("cp_repeating_signal", cp_repeating_signal));
                nameValuePairs.add(new BasicNameValuePair("cp_adj_line", cp_adj_line));
                nameValuePairs.add(new BasicNameValuePair("cp_neutral_section", cp_neutral_section));
                nameValuePairs.add(new BasicNameValuePair("cp_alp_round", cp_alp_round));
                nameValuePairs.add(new BasicNameValuePair("cp_coasting", cp_coasting));
                nameValuePairs.add(new BasicNameValuePair("cp_logbook", cp_logbook));
                nameValuePairs.add(new BasicNameValuePair("cp_braking_techniques", cp_braking_techniques));
                nameValuePairs.add(new BasicNameValuePair("cp_rest", cp_rest));
                nameValuePairs.add(new BasicNameValuePair("cp_uniform", cp_uniform));
                nameValuePairs.add(new BasicNameValuePair("cp_cug_off", cp_cug_off));
                nameValuePairs.add(new BasicNameValuePair("cp_whf_communication", cp_whf_communication));
                nameValuePairs.add(new BasicNameValuePair("cp_load_brake", cp_load_brake));
                nameValuePairs.add(new BasicNameValuePair("cp_co_readable", cp_co_readable));
                nameValuePairs.add(new BasicNameValuePair("cp_foulingmark", cp_foulingmark));
                nameValuePairs.add(new BasicNameValuePair("cp_platform", cp_platform));
                nameValuePairs.add(new BasicNameValuePair("cp_unauthorised_person", cp_unauthorised_person));
                nameValuePairs.add(new BasicNameValuePair("cp_habit_unusual", cp_habit_unusual));
                nameValuePairs.add(new BasicNameValuePair("cp_alp_moisture", cp_alp_moisture));
                nameValuePairs.add(new BasicNameValuePair("cp_habit_cms", cp_habit_cms));
                nameValuePairs.add(new BasicNameValuePair("cp_dbr", cp_dbr));

                nameValuePairs.add(new BasicNameValuePair("oth_irregularity", oth_irregularity));
                nameValuePairs.add(new BasicNameValuePair("oth_actions", oth_actions));








                try {
                    HttpClient httpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost(
                            "http://nikunjir.hol.es/insert_general.php");
                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                    HttpResponse response = httpClient.execute(httpPost);

                    HttpEntity entity = response.getEntity();

//                    is = entity.getContent();


                } catch (ClientProtocolException e) {

                } catch (IOException e) {

                }
                return "success";
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
                TextView textViewResult = (TextView) findViewById(R.id.textViewResult2);
                textViewResult.setText("Saved To Database. Thank You.");
            }
        }
        SendPostReqAsyncTask sendPostReqAsyncTask = new SendPostReqAsyncTask();

        sendPostReqAsyncTask.execute(name,unit,loco,insp_date,designation,department,bpc_date,train_no,from_depart,to_arrive,
                load_no,bpbf_pressure,bpc_no,punct_details,h_o,sch_details,crew_lp_name,crew_alp_name,crew_lp_pme_done_dt,
                crew_lp_pme_due_dt,crew_alp_pme_done_dt,crew_alp_pme_due_dt,crew_lp_ref_done_dt,crew_lp_ref_due_dt,crew_alp_ref_done_dt,
                crew_alp_ref_due_dt, crew_lp_abs_done_dt,crew_lp_abs_due_dt,crew_alp_abs_done_dt,crew_alp_abs_due_dt,crew_lp_driving_compt,
                crew_alp_driving_compt, crew_lp_nominated_li,crew_alp_nominated_li,crew_lp_last_monitoring_nli,crew_alp_last_monitoring_nli,
                crew_lp_psycho_date, crew_alp_psycho_date,crew_lp_safety_date,crew_alp_safety_date,si_spm,si_fl_afl,si_head_light,si_markerlight,
                si_afl,si_vcd,si_horn,si_ssc,si_shp_bp_fp,si_safety_u_clamp,si_fire_exting_no,si_fire_exting_exp_date,si_hand_parking_brake,
                si_ww,si_spare_fuse,si_detonator_no,si_detonator_validity,si_tricolor_torch,si_red_green_flag,si_spare_spect,cp_sober,cp_lp_bp,
                cp_exchange_signal,cp_whistled,cp_looked_back,cp_proper_authority,cp_caution_order,cp_max_permissible_speed,cp_repeating_signal,
                cp_adj_line,cp_neutral_section,cp_alp_round,cp_coasting,cp_logbook,cp_braking_techniques,cp_rest,cp_uniform,cp_cug_off,
                cp_whf_communication,cp_load_brake,cp_co_readable,cp_foulingmark,cp_platform,cp_unauthorised_person,cp_habit_unusual,cp_alp_moisture,
                cp_habit_cms,cp_dbr,oth_irregularity,oth_actions);

    }




}
