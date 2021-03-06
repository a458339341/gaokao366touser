package com.gaokao366.gaokao366touser;

import android.support.v4.view.ViewPager;

import com.flyco.banner.transform.DepthTransformer;
import com.flyco.banner.transform.FadeSlideTransformer;
import com.flyco.banner.transform.FlowTransformer;
import com.flyco.banner.transform.RotateDownTransformer;
import com.flyco.banner.transform.RotateUpTransformer;
import com.flyco.banner.transform.ZoomOutSlideTransformer;
import com.gaokao366.gaokao366touser.model.ui.main.bean.ExamPaperBean;

import java.util.ArrayList;

public class DataProvider {
    public static String[] titles = new String[]{
            "伪装者:胡歌演绎'痞子特工'",
            "无心法师:生死离别!月牙遭虐杀",
            "花千骨:尊上沦为花千骨",
            "综艺饭:胖轩偷看夏天洗澡掀波澜",
            "碟中谍4:阿汤哥高塔命悬一线,超越不可能",
    };
    public static String[] examType = new String[]{
            "数学",
            "英语",
            "语文",
            "理综",
    };
    public static String[] subjectType = new String[]{
            "语文",
            "数学",
            "英语",
            "物理",
            "化学",
            "生物",
            "政治",
            "历史",
            "地理",
    };
    public static String[] urls = new String[]{//640*360 360/640=0.5625
            "http://photocdn.sohu.com/tvmobilemvms/20150907/144160323071011277.jpg",//伪装者:胡歌演绎"痞子特工"
            "http://photocdn.sohu.com/tvmobilemvms/20150907/144158380433341332.jpg",//无心法师:生死离别!月牙遭虐杀
            "http://photocdn.sohu.com/tvmobilemvms/20150907/144160286644953923.jpg",//花千骨:尊上沦为花千骨
            "http://photocdn.sohu.com/tvmobilemvms/20150902/144115156939164801.jpg",//综艺饭:胖轩偷看夏天洗澡掀波澜
            "http://photocdn.sohu.com/tvmobilemvms/20150907/144159406950245847.jpg",//碟中谍4:阿汤哥高塔命悬一线,超越不可能
    };

    public static ArrayList<BannerItem> getList() {
        ArrayList<BannerItem> list = new ArrayList<BannerItem>();
        for (int i = 0; i < urls.length; i++) {
            BannerItem item = new BannerItem();
            item.imgUrl = urls[i];
            item.title = titles[i];

            list.add(item);
        }

        return list;
    }

    public static ArrayList<Integer> geUsertGuides() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.mipmap.guide_img_1);
        list.add(R.mipmap.guide_img_2);
        list.add(R.mipmap.guide_img_3);
        list.add(R.mipmap.guide_img_4);

        return list;
    }


    public static ArrayList<ExamPaperBean> getExamPaperBean() {
        ArrayList<ExamPaperBean> list = new ArrayList<ExamPaperBean>();
        for (int i = 0; i < 4; i++) {
            ExamPaperBean item = new ExamPaperBean();
            item.name = examType[i];

            list.add(item);
        }

        return list;
    }

    public static ArrayList<ExamPaperBean> getWatchBean() {
        ArrayList<ExamPaperBean> list = new ArrayList<ExamPaperBean>();
        for (int i = 0; i < 2; i++) {
            ExamPaperBean item = new ExamPaperBean();
            item.name = titles[i];

            list.add(item);
        }

        return list;
    }

    public static ArrayList<ExamPaperBean> getSubjecyBean() {
        ArrayList<ExamPaperBean> list = new ArrayList<ExamPaperBean>();
        for (int i = 0; i < subjectType.length; i++) {
            ExamPaperBean item = new ExamPaperBean();
            item.name = subjectType[i];

            list.add(item);
        }

        return list;
    }


    public static Class<? extends ViewPager.PageTransformer> transformers[] = new Class[]{
            DepthTransformer.class,
            FadeSlideTransformer.class,
            FlowTransformer.class,
            RotateDownTransformer.class,
            RotateUpTransformer.class,
            ZoomOutSlideTransformer.class,
    };
}
