package org.gdgtijuana.eventos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EventoDetalle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_evento_detalle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_evento_detalle, menu);
		return true;
	}

}
