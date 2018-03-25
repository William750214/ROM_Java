package com.heynas.enums;

/**
 * Created by Administrator on 2016/10/23.
 */
public enum Week {
    Monday("星期一", 10), Tuesday("星期二", 20), Wednesday("星期三", 30), Thursday("星期四", 40), Friday("星期五", 50), Saturday("星期六", 60), Sunday("星期日", 70);

    private Week(String chineseName, int index) {
        this.chineseName = chineseName;
        this.index = index;
    }

    private String chineseName;
    private int index;

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
