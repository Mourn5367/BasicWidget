package kr.ac.kopo.basicwidget;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit1;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);

        text1.setTextSize(20);
        text1.setTextColor(Color.CYAN);
        text1.setText("학대텍리폴국한");

        text2.setTextSize(20);
        text2.setTextColor(Color.DKGRAY);
        text2.setText("과어웨트프소능지공인");

        text3.setTextSize(20);
        text3.setTextColor(Color.BLUE);
        text3.setText("[Web발신]너는나를존중해야한다나는발롱도르5개와수많은개인트로피를들어올렸으며2016유로에서포르투갈을이끌고우승을차지했고동시에A매치역대최다득점자이다또한챔스역대최다득점자이자5번이나우승을차지한레알마드리드의상징이다또한36세의나이에도프리미어리그에서18골을기록하고챔스에서5경기연속골을기록하며내가세계최고임을증명해냈다은혜를모르는맨유보드진과팬들은내가맨유의골칫덩이라며쫓아냈지만내가세계최고이고내가팀보다위대하다는사실은바뀌지않는다내가사우디에간이유는메시에대한자격지심이아니라유럽에서이룰수있는모든것을이루었기에아시아를정복하기위해간것이지단지돈을위해서간것이아니다");
        text3.setSingleLine(true);

        edit1 = findViewById(R.id.edit1);
        textResult = findViewById(R.id.textResult);
        Button btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            String univName = edit1.getText().toString();
            String result = univName + "에 합격하신 것을 진심으로 축하드립니다.";
            textResult.setText(result);
            textResult.setTextColor(Color.rgb(128,65,217));

            // SpannableStringBuilder 생성
            SpannableStringBuilder ssb = new SpannableStringBuilder(result);

            // univName의 시작과 끝 인덱스 찾기
            int start = result.indexOf(univName);
            int end = start + univName.length();

            // univName 부분에 적용할 색상 스타일 정의 (여기서는 빨간색)
            ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.RED);

            // 스타일 적용 (univName 부분에만)
            ssb.setSpan(colorSpan, start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

            // 전체 메시지에는 다른 색상 적용 (여기서는 보라색)
            textResult.setTextColor(Color.rgb(128, 65, 217));

            // TextView에 SpannableStringBuilder 설정
            textResult.setText(ssb);

        }
    };
}