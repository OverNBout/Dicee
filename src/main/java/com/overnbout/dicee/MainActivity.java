package com.overnbout.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaração de Variáveis


        Button rollButton;


        //associar váriaveis a elementos do Layout. entre () o tipo de componente
        //findViewById para encontrar o elemento em que (R = pasta Resources

        rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_LeftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_RightDice);

        //Ir buscar os 6 dados e associar a uma variavel, que contem Um Array
        // final para justificar ao programa que aquela variavel nunca mais vai mudar os valores

         final int[] leftArray =  {
                            R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6
                        };
         final int[] rightArray=  {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };



// Detetar se o botão é pressionado
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d gera uma mensagem de Log...neste caso só para testar que o botao funka
                Log.d("Dicee", "the Button has Been SQUEEZED");
                //descrição do motor de random
                Random randomNumberGenerator = new Random();
                // associar uma variael (number) ao motor do random e definir de 0 a X num ele vai randomizar
                int LeftD = randomNumberGenerator.nextInt(6);
                int RightD = randomNumberGenerator.nextInt(6);

               // Log.d("Dicee", "The Number are:" {+LeftD,+RightD});

                //muda a imagem de cada dado no layout
                leftDice.setImageResource(leftArray[LeftD]);
                rightDice.setImageResource(rightArray[RightD]);
            }
        });
    }
}
