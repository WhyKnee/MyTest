package com.fanzhao.crawlername;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class infoDataBase {
    private String lastNameWeb = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
    private String boyNameWeb = "http://www.haoming8.cn/baobao/10881.html";
    private String girlNameWeb = "http://www.haoming8.cn/baobao/7641.html";


    protected char lastName() throws IOException {
        ArrayList<String> lastNameListTemp = chooseData(webCrawler(lastNameWeb), "(.{4})(，|。)", 1);
        char lastName = getLastName(lastNameListTemp);
        return lastName;
    }

    protected String boyName() throws IOException {
        ArrayList<String> boyNameListTemp = chooseData(webCrawler(boyNameWeb), "([\\u4e00-\\u9fa5]{2})(、|。)", 1);
        return getBoyName(boyNameListTemp);

    }

    protected String girlName() throws IOException {
        ArrayList<String> girlNameListTemp = chooseData(webCrawler(girlNameWeb), "([\\u4e00-\\u9fa5]{2} ){4}([\\u4e00-\\u9fa5]{2})", 0);
       return getGirlName(girlNameListTemp);
    }
    //爬取数据
    protected  String webCrawler(String webSource) throws IOException {
        StringBuilder sb=new StringBuilder();
        URL url=new URL(webSource);

        URLConnection conn = url.openConnection();
        InputStreamReader isr=new InputStreamReader(conn.getInputStream());
        char[] data=new char[2];
        int len;
        while((len=isr.read(data))!=-1){
            sb.append(data);
        }
        return sb.toString();
    }

    //处理抓取到的数据
    protected  ArrayList<String> chooseData(String sourceData, String regex, int index) {
        ArrayList<String> arrayList=new ArrayList<>();
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(sourceData);
        while (matcher.find()) {
            arrayList.add(matcher.group(index));
        }
        return arrayList;
    }

    //处理并返回所需数据
    protected  char getLastName(List<String> list){
        List<String> lastNameList = list.stream()
                .limit(list.size() - 1)
                .collect(Collectors.toList());
        char[] lastName = lastNameList.get(new Random().nextInt(lastNameList.size())).toCharArray();
        return lastName[new Random().nextInt(lastName.length)];
    }

    protected  String getBoyName(List<String> list){
        List<String> names = list.stream().distinct().collect(Collectors.toList());
        return names.get(new Random().nextInt(names.size()));

    }

    protected  String getGirlName(List<String> list){
        ArrayList<String> arrayList=new ArrayList<>();
        for (String s : list) {
            String[] names = s.split(" ");
            for (int i = 0; i < names.length; i++) {
                arrayList.add(names[i]);
            }
        }
        return arrayList.get(new Random().nextInt(arrayList.size()));
    }

    protected HashSet<String> generateInfo(int boyNum, int girlNum) throws IOException {
        HashSet<String> info=new HashSet<>();
        HashSet<String> boys=new HashSet<>();
        HashSet<String> girls=new HashSet<>();
        int i=0;
        while(i<boyNum) {
            String name = lastName() + boyName();
            if (boys.add(name)) {
                info.add(name + "-男-" + (new Random().nextInt(7)+18));
                i++;
            }
        }
        i=0;
        while(i<girlNum){
            String name=lastName()+girlName();
            if(girls.add(name)){
            info.add(name+"-女-"+(new Random().nextInt(8)+18));
            i++;
            }
        }
        return info;
    }

}
