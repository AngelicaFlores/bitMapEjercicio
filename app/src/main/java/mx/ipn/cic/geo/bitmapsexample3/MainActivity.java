package mx.ipn.cic.geo.bitmapsexample3;

import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand;
    Button buttonDrawBitmap;
    ImageView imageViewBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rand =  new Random();
        this.buttonDrawBitmap = findViewById(R.id.buttonDrawBitmap);
        this.imageViewBitmap = this.findViewById(R.id.imageViewBitmap);
        this.buttonDrawBitmap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*
                BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap);
                task.execute(R.drawable.forest_restoration_map);
                */
                // Ejercicio. Quitar el mapa de bits.
                // Agregar 10 imágenes png de su elección (1 - 2 MB).
                // Investigar la función para generar números aleatorios.
                // Generar un número aleatorio del 1 al 9.
                // Cargar la i-esima imagen de forma aleatoria.
                int int_random = rand.nextInt(10)+1;

                switch (int_random){
                    case 1:
                        if (cancelPotentialWork(R.drawable.imag_1, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_1);
                        }
                        break;
                    case 2:
                        if (cancelPotentialWork(R.drawable.imag_2, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_2);
                        }
                        break;
                    case 3:
                        if (cancelPotentialWork(R.drawable.imag_3, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_3);
                        }
                        break;
                    case 4:
                        if (cancelPotentialWork(R.drawable.imag_4, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_4);
                        }
                        break;
                    case 5:
                        if (cancelPotentialWork(R.drawable.imag_5, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_5);
                        }
                        break;
                    case 6:
                        if (cancelPotentialWork(R.drawable.imag_6, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_6);
                        }
                        break;
                    case 7:
                        if (cancelPotentialWork(R.drawable.imag_7, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_7);
                        }
                        break;
                    case 8:
                        if (cancelPotentialWork(R.drawable.imag_8, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_8);
                        }
                        break;
                    case 9:
                        if (cancelPotentialWork(R.drawable.imag_9, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_9);
                        }
                        break;
                    default:
                        if (cancelPotentialWork(R.drawable.imag_10, imageViewBitmap)) {
                            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
                            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                                    getResources(), imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
                            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
                            imageViewBitmap.setImageDrawable(asyncDrawable);
                            task.execute(R.drawable.imag_10);
                        }
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        //        switch (item.getItemId()) {
        //            case R.id.itemMenuLoadBitmap:
        //                Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
        //                BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap, getResources(),
        //                        imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
        //                task.execute(R.drawable.forest_restoration_map);
        //                return true;
        //            case R.id.itemMenuClearBitmap:
        //                imageViewBitmap.setImageResource(android.R.color.transparent);
        //                return true;
        //            case R.id.itemMenuExitApp:
        //                this.finish();
        //                System.exit(RESULT_OK);
        //                return true;
        //            default:
        //                return super.onOptionsItemSelected(item);
        //        }

        int itemId = item.getItemId();
        if (itemId == R.id.itemMenuLoadBitmap) {
            int int_random = rand.nextInt(10)+1;
            Log.i("onOptiomsItemSelected", "Creando objeto tarea asíncrona");
            final BitmapWorkerTask task = new BitmapWorkerTask(imageViewBitmap,
                    getResources(),imageViewBitmap.getWidth(), imageViewBitmap.getHeight());
            final AsyncDrawable asyncDrawable =  new AsyncDrawable(getResources(), null, task);
            imageViewBitmap.setImageDrawable(asyncDrawable);
            switch (int_random){
                case 1:
                    task.execute(R.drawable.imag_1);
                    break;
                case 2:
                    task.execute(R.drawable.imag_2);
                    break;

                case 3:
                    task.execute(R.drawable.imag_3);
                    break;
                case 4:
                    task.execute(R.drawable.imag_4);
                    break;
                case 5:
                    task.execute(R.drawable.imag_5);
                    break;
                case 6:
                    task.execute(R.drawable.imag_6);
                    break;
                case 7:
                    task.execute(R.drawable.imag_7);
                    break;
                case 8:
                    task.execute(R.drawable.imag_8);
                    break;
                case 9:
                    task.execute(R.drawable.imag_9);
                    break;
                default:
                    task.execute(R.drawable.imag_10);
                    break;
            }

            return true;
        }
        else if (itemId == R.id.itemMenuClearBitmap) {
            imageViewBitmap.setImageResource(android.R.color.transparent);
            return true;
        }
        else if (itemId  == R.id.itemMenuExitApp) {
            this.finish();
            System.exit(RESULT_OK);
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }

    public boolean cancelPotentialWork(int data, ImageView imageView) {
        final BitmapWorkerTask bitmapWorkerTask = getBitmapWorkerTask(imageView);

        if (bitmapWorkerTask != null) {
            Log.i("cancelPotentialWork", "Buscando procesos previos...");
            final int bitmapData = bitmapWorkerTask.getBitmapData();
            if (bitmapData != data) {
                // Cancel previous task
                Log.i("cancelPotencialWork", "Cancelando tarea asíncrona...");
                bitmapWorkerTask.cancel(true);
                return true;
            } else {
                // The same work is already in progress
                return false;
            }
        }
        Log.i("cancelPotentialWork", "No hay hilos previos o ya se finalizaron");
        // No task associated with the ImageView, or an existing task was cancelled
        return true;
    }

    private BitmapWorkerTask getBitmapWorkerTask(ImageView imageView) {
        if (imageView != null) {
            final Drawable drawable = this.imageViewBitmap.getDrawable();
            if (drawable instanceof AsyncDrawable) {
                final AsyncDrawable asyncDrawable = (AsyncDrawable) drawable;
                return asyncDrawable.getBitmapWorkerTask();
            }
        }
        return null;
    }
}