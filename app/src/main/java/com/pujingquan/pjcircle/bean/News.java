package com.pujingquan.pjcircle.bean;

import java.util.List;

/**
 * Description:
 * Created on 2017/8/31
 */

public class News {
    String stat ;
    List<Data> data;


    class Data {
//        uniquekey: "4b1b84e08b0ebb227c359a0170bb9a1e",
//        title: "一夫四妻：男子娶了4个老婆，生下17个孩子，老婆们亲如姐妹",
//        date: "2017-08-31 18:57",
//        category: "头条",
//        author_name: "爆料生活",
//        url: "http://mini.eastday.com/mobile/170831185725470.html",
//        thumbnail_pic_s: "http://08.imgmini.eastday.com/mobile/20170831/20170831_ea230305d74cf856c060b2855bbd2688_cover_mwpm_03200403.jpeg",
//        thumbnail_pic_s02: "http://08.imgmini.eastday.com/mobile/20170831/20170831_fc50452bb0e200f6d4adcd948eab5920_cover_mwpm_03200403.jpeg",
//        thumbnail_pic_s03: "http://08.imgmini.eastday.com/mobile/20170831/20170831_fa6b1f54051d19428025c7aef49b93e1_cover_mwpm_03200403.jpeg"

        String uniquekey;
        String title;
        String date;
        String category;
        String author_name;
        String url;
        String thumbnail_pic_s;
        String thumbnail_pic_s02;
        String thumbnail_pic_s03;

        @Override
        public String toString() {
            return "Data{" +
                    "uniquekey='" + uniquekey + '\'' +
                    ", title='" + title + '\'' +
                    ", date='" + date + '\'' +
                    ", category='" + category + '\'' +
                    ", author_name='" + author_name + '\'' +
                    ", url='" + url + '\'' +
                    ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                    ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                    ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "News{" +
                "stat='" + stat + '\'' +
                ", data=" + data.toString() +
                '}';
    }
}
