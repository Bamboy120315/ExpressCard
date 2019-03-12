package com.bamboy.expresscarddemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bamboy.expresscarddemo.fragment.BeanExpress;
import com.bamboy.expresscarddemo.fragment.CardFragment;
import com.bamboy.expresscarddemo.viewpager.CardTransformer;
import com.bamboy.expresscarddemo.viewpager.CardViewPagerAdapter;
import com.bamboy.expresscarddemo.viewpager.UtilShowAnim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bamboy on 2019/3/6.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 工具类 用于控制出场动画
     */
    private UtilShowAnim mUtilAnim;
    /**
     * ViewPager对象
     */
    private ViewPager vp_card;
    /**
     * ViewPager适配器
     */
    private CardViewPagerAdapter mAdapter;
    /**
     * 数据源
     */
    private List<CardFragment> mList;
    /**
     * 切换动画
     */
    private CardTransformer mTransformer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化点击事件
        initBtn();

        // 初始化ViewPager
        initViewPager();
    }

    /**
     * 初始化按钮
     */
    private void initBtn() {
        findViewById(R.id.btn_show_card_inproperorder).setOnClickListener(this);
        findViewById(R.id.btn_show_card_unfold).setOnClickListener(this);
        findViewById(R.id.btn_show_card_rotation).setOnClickListener(this);
        findViewById(R.id.btn_change_stack).setOnClickListener(this);
        findViewById(R.id.btn_change_scale).setOnClickListener(this);
        findViewById(R.id.btn_change_windmill).setOnClickListener(this);
    }

    /**
     * 初始化ViewPager
     */
    private void initViewPager() {

        // 实例化View
        vp_card = findViewById(R.id.vp_card);

        // 实例化出场动画工具类
        mUtilAnim = new UtilShowAnim(vp_card);

        // 初始化数据
        initData();

        // 实例化适配器
        mAdapter = new CardViewPagerAdapter(getSupportFragmentManager(), mList);
        vp_card.setAdapter(mAdapter);

        // 实例化ViewPager切换动画类
        mTransformer = new CardTransformer();

        // 设置动画类
        vp_card.setPageTransformer(true, mTransformer);

        // 设置切换动画为 层叠效果，并获取预加载数量
        int offscreen = mTransformer.setTransformerType(CardTransformer.ANIM_TYPE_STACK);
        // 设置ViewPager的预加载数量
        vp_card.setOffscreenPageLimit(offscreen);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            // 出场效果 =》逐一效果
            case R.id.btn_show_card_inproperorder:
                mAdapter = new CardViewPagerAdapter(getSupportFragmentManager(), mList);
                vp_card.setAdapter(mAdapter);

                // 设置卡片动画为 逐一效果
                mUtilAnim.cardAnim(UtilShowAnim.ANIM_TYPE_INPROPERORDER);
                break;

            // 出场效果 =》展开效果
            case R.id.btn_show_card_unfold:
                mAdapter = new CardViewPagerAdapter(getSupportFragmentManager(), mList);
                vp_card.setAdapter(mAdapter);

                // 设置卡片动画为 展开效果
                mUtilAnim.cardAnim(UtilShowAnim.ANIM_TYPE_UNFOLD);
                break;

            // 出场效果 =》旋转效果
            case R.id.btn_show_card_rotation:
                mAdapter = new CardViewPagerAdapter(getSupportFragmentManager(), mList);
                vp_card.setAdapter(mAdapter);

                // 设置卡片动画为 旋转效果
                mUtilAnim.cardAnim(UtilShowAnim.ANIM_TYPE_ROTATION);
                break;

            // 切换效果 =》层叠效果
            case R.id.btn_change_stack:
                int offscreenStack = mTransformer.setTransformerType(CardTransformer.ANIM_TYPE_STACK);
                vp_card.setOffscreenPageLimit(offscreenStack);

                mAdapter = new CardViewPagerAdapter(getSupportFragmentManager(), mList);
                vp_card.setAdapter(mAdapter);
                break;

            // 切换效果 =》缩放效果
            case R.id.btn_change_scale:
                int offscreenScale = mTransformer.setTransformerType(CardTransformer.ANIM_TYPE_SCALE);
                vp_card.setOffscreenPageLimit(offscreenScale);

                mAdapter = new CardViewPagerAdapter(getSupportFragmentManager(), mList);
                vp_card.setAdapter(mAdapter);
                break;

            // 切换效果 =》风车效果
            case R.id.btn_change_windmill:
                int offscreenWindmill = mTransformer.setTransformerType(CardTransformer.ANIM_TYPE_WINDMILL);
                vp_card.setOffscreenPageLimit(offscreenWindmill);

                mAdapter = new CardViewPagerAdapter(getSupportFragmentManager(), mList);
                vp_card.setAdapter(mAdapter);
                break;
        }

    }

    /**
     * 处理数据
     */
    private void initData() {
        mList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            BeanExpress express1 = new BeanExpress();
            express1.setConsignee("申神审");
            express1.setExpress("申宝快递");
            List<String> conveyInfo1 = new ArrayList<>();
            conveyInfo1.add("2018-11-15 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo1.add("2018-11-15 03:50:50\n阿富汗正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo1.add("2018-11-14 20:10:00\n正在装机，准备送往阿富汗");
            conveyInfo1.add("2018-11-14 16:45:19\n已被重新收件");
            conveyInfo1.add("2018-11-14 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo1.add("2018-11-14 03:50:50\n阿富汗正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo1.add("2018-11-13 20:10:00\n正在装机，准备送往阿富汗");
            conveyInfo1.add("2018-11-13 16:45:19\n已被重新收件");
            conveyInfo1.add("2018-11-13 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo1.add("2018-11-13 03:50:50\n阿富汗正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo1.add("2018-11-12 20:10:00\n正在装机，准备送往阿富汗");
            conveyInfo1.add("2018-11-12 16:45:19\n已被重新收件");
            conveyInfo1.add("2018-11-12 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo1.add("2018-11-12 03:50:50\n阿富汗正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo1.add("2018-11-11 20:10:00\n正在装机，准备送往阿富汗");
            conveyInfo1.add("2018-11-11 16:45:19\n已被收件");
            express1.setConvey_info(conveyInfo1);
            CardFragment fragment1 = new CardFragment();
            fragment1.setExpress(express1);
            mList.add(fragment1);

            BeanExpress express2 = new BeanExpress();
            express2.setConsignee("中肿仲");
            express2.setExpress("中宝快递");
            List<String> conveyInfo2 = new ArrayList<>();
            conveyInfo2.add("2018-11-15 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo2.add("2018-11-15 03:50:50\n伊拉克正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo2.add("2018-11-14 20:10:00\n正在装机，准备送往伊拉克");
            conveyInfo2.add("2018-11-14 16:45:19\n已被收件");
            express2.setConvey_info(conveyInfo2);
            CardFragment fragment2 = new CardFragment();
            fragment2.setExpress(express2);
            mList.add(fragment2);

            BeanExpress express3 = new BeanExpress();
            express3.setConsignee("圆远园");
            express3.setExpress("圆宝快递");
            List<String> conveyInfo3 = new ArrayList<>();
            conveyInfo3.add("2018-11-15 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo3.add("2018-11-15 03:50:50\n西班牙正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo3.add("2018-11-14 20:10:00\n正在装机，准备送往西班牙");
            conveyInfo3.add("2018-11-14 16:45:19\n已被重新收件");
            conveyInfo3.add("2018-11-14 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo3.add("2018-11-14 03:50:50\n西班牙正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo3.add("2018-11-13 20:10:00\n正在装机，准备送往西班牙");
            conveyInfo3.add("2018-11-13 16:45:19\n已被重新收件");
            conveyInfo3.add("2018-11-13 05:03:19\n经过一番抢救，最终放弃，已联系卖家重新发货");
            conveyInfo3.add("2018-11-13 03:50:50\n西班牙正在打仗，飞机被导弹击落，您的快递正在被燃烧");
            conveyInfo3.add("2018-11-12 20:10:00\n正在装机，准备送往西班牙");
            conveyInfo3.add("2018-11-12 16:45:19\n已被收件");
            express3.setConvey_info(conveyInfo3);
            CardFragment fragment3 = new CardFragment();
            fragment3.setExpress(express3);
            mList.add(fragment3);

            BeanExpress express4 = new BeanExpress();
            express4.setConsignee("顺瞬舜");
            express4.setExpress("顺宝快递");
            List<String> conveyInfo4 = new ArrayList<>();
            conveyInfo4.add("2018-11-15 05:03:19\n已被收件");
            express4.setConvey_info(conveyInfo4);
            CardFragment fragment4 = new CardFragment();
            fragment4.setExpress(express4);
            mList.add(fragment4);
        }
    }
}
