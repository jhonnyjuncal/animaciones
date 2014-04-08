package com.jhonny.animaciones;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
	private TextView texto;
	private ImageView logo;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		texto = (TextView)findViewById(R.id.txt_anim);
        logo = (ImageView)findViewById(R.id.logo);
        logo.setBackgroundResource(R.drawable.ic_launcher);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void accionAnimar(View view){

        Animation rotar = AnimationUtils.loadAnimation(this, R.anim.rotar);
        rotar.reset();
        
		switch(view.getId()){
			case R.id.btn_escalar:
				Animation escalar = AnimationUtils.loadAnimation(this, R.anim.escalar);
		        escalar.reset();
				logo.startAnimation(escalar);
				break;

			case R.id.btn_rotar:
				Animation rotacion = AnimationUtils.loadAnimation(this, R.anim.rotar);
		        rotacion.reset();
				logo.startAnimation(rotacion);
				break;

			case R.id.btn_mezcla1:
				Animation mezcla1 = AnimationUtils.loadAnimation(this, R.anim.mezcla1);
				mezcla1.reset();
				logo.startAnimation(mezcla1);
				break;

			case R.id.btn_mover:
				Animation mover = AnimationUtils.loadAnimation(this, R.anim.transladar);
				mover.reset();
				texto.startAnimation(mover);
				break;

			case R.id.btn_trans:
				Animation transparente = AnimationUtils.loadAnimation(this, R.anim.transparencia);
				transparente.reset();
				texto.startAnimation(transparente);
				break;

			case R.id.btn_mezcla2:
				Animation mezcla2 = AnimationUtils.loadAnimation(this, R.anim.mezcla2);
			    mezcla2.reset();
			    texto.startAnimation(mezcla2);
			    break;    

		}
	}

}
