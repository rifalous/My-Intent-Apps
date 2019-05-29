package id.rifalous.myintentapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static final Object EXTRA_PERSON = "extra_person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
    }
}
