package jacky_zf.pinyinautotips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import jacky_zf.pinyinlibrary.SearchAdapter;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView search;

    public SearchAdapter adapter = null;//

    public String[] hanzi = {  /* "内蒙古"*/ //需要读取
            "北京","天津","河北","山西","内蒙古","辽宁","吉林","黑龙江","上海","江苏",
            "浙江","安徽","福建","江西","山东","河南","湖北","湖南","广东","广西","海南",
            "重庆","四川","贵州","云南","西藏","陕西","甘肃","青海","宁夏","新疆","台湾","香港","澳门"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        search.setThreshold(1);

//        adapter = new SearchAdapter(this, android.R.layout.simple_dropdown_item_1line, Arrays.asList(hanzi), SearchAdapter.ALL);//速度优先

        adapter = new SearchAdapter(this, android.R.layout.simple_dropdown_item_1line, hanzi, SearchAdapter.ALL);//速度优先

        search.setAdapter(adapter);//
    }

}
