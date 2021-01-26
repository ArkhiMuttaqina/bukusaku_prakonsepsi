package com.credeative.giziprakonsepsi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.credeative.giziprakonsepsi.kzgp1.main_kzgp1;
import com.credeative.giziprakonsepsi.mg1.main_mg1;
import com.credeative.giziprakonsepsi.sg1.main_sg1;
import com.credeative.giziprakonsepsi.sg1.sg1_faktor;
import com.google.android.material.textfield.TextInputEditText;

import studio.carbonylgroup.textfieldboxes.TextFieldBoxes;

public class hitung_gizi extends AppCompatActivity {
    Dialog dialoglist, imt_dialog, bbi_dialog;
    String tb, bb, nama, umur, hasil, ket, imt_i, bbi_i, menuju_i;
    TextInputEditText edit_tb, edit_bb, edit_nama, edit_umur;
    TextView bb_text, tb_text, nama_text, umur_text, imt_result, imt_count_result, bbi_result, kudune;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_gizi);
        getSupportActionBar().hide();
        opendialog();
        hitungtunghitung();
        LinearLayout imt_button = findViewById(R.id.imt_button);
        LinearLayout bbi_button = findViewById(R.id.bbi_button);
        TextView link1 = findViewById(R.id.link1);
        TextView link2 = findViewById(R.id.link2);

        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(hitung_gizi.this, main_mg1.class);
                startActivity(myIntent);
                hitung_gizi.this.finish();
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(hitung_gizi.this, sg1_faktor.class);
                startActivity(myIntent);
                hitung_gizi.this.finish();
            }
        });
        imt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imt_dialog.getWindow().setWindowAnimations(R.style.Animation);
                imt_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                imt_dialog.show();

            }
        });
        bbi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bbi_dialog.getWindow().setWindowAnimations(R.style.Animation);
                bbi_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                bbi_dialog.show();

            }
        });

        ImageButton ubah = findViewById(R.id.ubah);
        ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialoglist.getWindow().setWindowAnimations(R.style.Animation);
                dialoglist.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialoglist.show();
                dialoglist.setCanceledOnTouchOutside(false);

            }
        });
        Button btn_status = findViewById(R.id.btn_status);
        btn_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(hitung_gizi.this, main_sg1.class);
                startActivity(myIntent);
                hitung_gizi.this.finish();

            }
        });
    }
    private void hitungtunghitung() {
    Button btn_hitung_aja = findViewById(R.id.btn_hitung_aja);
        btn_hitung_aja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(nama)) {
                    dialoglist.getWindow().setWindowAnimations(R.style.Animation);
                    dialoglist.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialoglist.show();
                    dialoglist.setCanceledOnTouchOutside(false);
                    edit_nama.setError("belum di isi");
                } else if (TextUtils.isEmpty(umur)) {
                    dialoglist.getWindow().setWindowAnimations(R.style.Animation);
                    dialoglist.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialoglist.show();
                    dialoglist.setCanceledOnTouchOutside(false);
                    edit_umur.setError("belum di isi");
                } else if (TextUtils.isEmpty(bb)) {
                    dialoglist.getWindow().setWindowAnimations(R.style.Animation);
                    dialoglist.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialoglist.show();
                    dialoglist.setCanceledOnTouchOutside(false);
                    edit_bb.setError("belum di isi");
                } else if (TextUtils.isEmpty(tb)) {
                    dialoglist.getWindow().setWindowAnimations(R.style.Animation);
                    dialoglist.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialoglist.show();
                    dialoglist.setCanceledOnTouchOutside(false);
                    edit_tb.setError("belum di isi");
                } else {
                    double beratBadan = Double.parseDouble(bb);
                    double tinggiBadan = Double.parseDouble(tb);
                    //rumus
                    //BMI = Berat Badan kg/ (Tinggi Badan m * Tinggi Badan m)
                    double bmi = beratBadan / (tinggiBadan * tinggiBadan * 000.0001);
                    double bbi = (tinggiBadan-100) - ((tinggiBadan - 100 ) * 00.1);

                    Log.d("tag", "Nama = " + nama + "\nbmi = " + bmi + "");
                    if (bmi < 18.5) {
                        //Log.d("keterangan Perempuan", "Under Weight/Kurus – Sebaiknya mulai menambah berat badan dan mengkonsumsi makanan berkarbohidrat di imbangi dengan olah raga");
                            hasil = "Kurus";
                        //  ket = "Sebaiknya mulai menambah berat badan dan mengkonsumsi makanan berkarbohidrat di imbangi dengan olah raga";
                    } else if (bmi >= 18.5 && bmi < 22.99) {
                        //Log.d("keterangan Perempuan","Normal Weight/Normal – Bagus, berat badan anda termasuk kategori ideal");
                        hasil = "Normal";
                        //    ket = "Bagus, berat badan anda termasuk kategori ideal";
                    } else if (bmi >= 23 && bmi < 24.99) {
                        //Log.d("keterangan Perempuan","Over Weight/Kegemukan – anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali");
                        hasil = "Gemuk";
                        //ket = "Anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali";
                    } else if (bmi >= 25 && bmi < 29.99) {
                        //Log.d("keterangan Perempuan","Over Weight/Kegemukan – anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali");
                        hasil = "Obesitas Kelas 1";
                        //ket = "Anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali";
                    }
                    else {
                        //Log.d("keterangan Perempuan","\tObesitas – Sebaiknya segera membuat program menurunkan berat badan karena anda termasuk kategori obesitas/ terlalu gemuk dan tidak baik bagi kesehatan");
                        hasil = "Obesitas Kelas 2";
                        // ket = "Sebaiknya segera membuat program menurunkan berat badan karena anda termasuk kategori obesitas/ terlalu gemuk dan tidak baik bagi kesehatan";
                    }


                    Log.d("tag", "Nama = " + nama + "\nbmi = " + bmi + "\n" + "hasil : " + hasil + "\nket : " + ket + "\n");
                    imt_result.setText(hasil.trim().toString());
                    imt_i = String.valueOf(bmi);
                    bbi_i = String.valueOf(bbi);
                    imt_count_result.setText(imt_i);
                    bbi_result.setText(bbi_i);


                }

            }
        });
    }


            public void opendialog() {
                imt_dialog = new Dialog(this);
                imt_dialog.setContentView(R.layout.popup_imtt);

                Button imt_tutup;
                imt_tutup = imt_dialog.findViewById(R.id.imt_tutup);
                imt_tutup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imt_dialog.dismiss();
                        }
                });

                bbi_dialog = new Dialog(this);
                bbi_dialog.setContentView(R.layout.popup_bbi);
                Button bbi_tutup;
                bbi_tutup = bbi_dialog.findViewById(R.id.bbi_tutup);
                bbi_tutup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bbi_dialog.dismiss();
                    }
                });
                dialoglist = new Dialog(this);
                dialoglist.setContentView(R.layout.popup_edit);
                ImageButton kembali = findViewById(R.id.kembali);
                kembali.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });

                imt_result = findViewById(R.id.imt_result);
             //   kudune = findViewById(R.id.kudune);
                imt_count_result = findViewById(R.id.imt_count_result);
                bbi_result = findViewById(R.id.bbi_result);
                nama_text = findViewById(R.id.nama_text);
                umur_text = findViewById(R.id.umur_text);
                bb_text = findViewById(R.id.bb_text);
                tb_text = findViewById(R.id.tb_text);
                edit_nama = dialoglist.findViewById(R.id.ext_nama);
                edit_umur = dialoglist.findViewById(R.id.ext_umur);
                edit_tb = dialoglist.findViewById(R.id.ext_tb);
                edit_bb = dialoglist.findViewById(R.id.ext_bb);
                Button btn_done_input;
                btn_done_input = dialoglist.findViewById(R.id.btn_done_input);
                btn_done_input.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        nama = edit_nama.getText().toString();
                        umur = edit_umur.getText().toString();
                        bb = edit_bb.getText().toString();
                        tb = edit_tb.getText().toString();
                        if (TextUtils.isEmpty(nama)) {
                            edit_nama.setError("belum di isi");
                        } else if (TextUtils.isEmpty(umur)) {
                            edit_umur.setError("belum di isi");
                        } else if (TextUtils.isEmpty(bb)) {
                            edit_bb.setError("belum di isi");
                        } else if (TextUtils.isEmpty(tb)) {
                            edit_tb.setError("belum di isi");
                        } else {

                            dialoglist.dismiss();
                            nama_text.setText(edit_nama.getText().toString());
                            umur_text.setText(edit_umur.getText().toString());
                            bb_text.setText(edit_bb.getText().toString());
                            tb_text.setText(edit_tb.getText().toString());

                        }

                    }
                });
            }

}



