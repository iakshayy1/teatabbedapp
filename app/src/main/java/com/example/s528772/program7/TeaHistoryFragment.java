package com.example.s528772.program7;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by s528772 on 10/26/2017.
 */

public class TeaHistoryFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_tea_history,container,false);
        TextView txtDetails = (TextView) view.findViewById(R.id.textView10);
        txtDetails.setText("The history of tea is long and complex, spreading across multiple cultures over the span of thousands of years. Tea likely originated in southwest China during the Shang dynasty as a medicinal drink. An early credible record of tea drinking dates to the 3rd century AD, in a medical text written by Hua Tuo. Tea was first introduced to Portuguese priests and merchants in China during the 16th century. Drinking tea became popular in Britain during the 17th century. The British introduced tea production, as well as tea consumption, to India, in order to compete with the China monopoly on tea.On morphological differences between the Assamese and Chinese varieties, botanists have long asserted a dual botanical origin for tea; however, statistical cluster analysis, the same chromosome number (2n=30), easy hybridization, and various types of intermediate hybrids and spontaneous polyploids all appear to demonstrate a single place of origin for Camellia sinensis — the area including the northern part of Burma, and Yunnan and Sichuan provinces of China.\n" +
                "\n" +
                "Yunnan Province has also been identified as \"the birthplace of tea…the first area where humans figured out that eating tea leaves or brewing a cup could be pleasant.\"Fengqing County in the Lincang City Prefecture of Yunnan Province in China is said to be home to the world's oldest cultivated tea tree, some 3,200 years old.\n" +
                "\n" +
                "According to The Story of Tea, tea drinking likely began in Yunnan province during the Shang Dynasty (1500 BC–1046 BC), as a medicinal drink. From there, the drink spread to Sichuan, and it is believed that there \"for the first time, people began to boil tea leaves for consumption into a concentrated liquid without the addition of other leaves or herbs, thereby using tea as a bitter yet stimulating drink, rather than as a medicinal concoction.\"");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
        return view;
    }
}
