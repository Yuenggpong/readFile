package com.readFile.dao;

import com.readFile.DBUtil;
import com.readFile.mapper.hotel2000wMapper;
import com.readFile.po.hotel2000w;
import org.apache.ibatis.session.SqlSession;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class hotel2000WDao {
    public static void main(String[] args) throws IOException {
        // selectAllPerson();

        String filePath = "C:/Users/yzp/Desktop/Hotel/HoTelData(30).csv";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath)), "UTF-8"));
        List<hotel2000w> hotelList = new ArrayList<hotel2000w>();
        String str = null;

        while ((str = bufferedReader.readLine()) != null) {
            String[] tempStr = null;
            tempStr = StringFilter(str).split(",");
            if (tempStr.length == 33) {
                //Name,CardNo,Descriot,CtfTp,CtfId,Gender,Birthday,Address,Zip,Dirty,District1,District2,District3,District4,District5,District6,FirstNm,LastNm,Duty,Mobile,Tel,Fax,EMail,Nation,Taste,Education,Company,CTel,CAddress,CZip,Family,Version,id
                hotel2000w hotel2000wObj = new hotel2000w();
                hotel2000wObj.setName(tempStr[0]==""?null:tempStr[0]);
                hotel2000wObj.setCardNo(tempStr[1]==""?null:tempStr[1]);
                hotel2000wObj.setDescriot(tempStr[2]==""?null:tempStr[2]);
                hotel2000wObj.setCtfTp(tempStr[3]==""?null:tempStr[3]);
                hotel2000wObj.setCtfId(tempStr[4]==""?null:tempStr[4]);
                hotel2000wObj.setGender(tempStr[5]==""?null:tempStr[5]);
                hotel2000wObj.setBirthday(tempStr[6]==""?null:tempStr[6]);
                hotel2000wObj.setAddress(tempStr[7]==""?null:tempStr[7]);
                hotel2000wObj.setZip(tempStr[8]==""?null:tempStr[8]);
                hotel2000wObj.setDirty(tempStr[9]==""?null:tempStr[9]);
                hotel2000wObj.setDistrict1(tempStr[10]==""?null:tempStr[10]);
                hotel2000wObj.setDistrict2(tempStr[11]==""?null:tempStr[11]);
                hotel2000wObj.setDistrict3(tempStr[12]==""?null:tempStr[12]);
                hotel2000wObj.setDistrict4(tempStr[13]==""?null:tempStr[13]);
                hotel2000wObj.setDistrict5(tempStr[14]==""?null:tempStr[14]);
                hotel2000wObj.setDistrict6(tempStr[15]==""?null:tempStr[15]);
                hotel2000wObj.setFirstNm(tempStr[16]==""?null:tempStr[16]);
                hotel2000wObj.setLastNm(tempStr[17]==""?null:tempStr[17]);
                hotel2000wObj.setDuty(tempStr[18]==""?null:tempStr[18]);
                hotel2000wObj.setMobile(tempStr[19]==""?null:tempStr[19]);
                hotel2000wObj.setTel(tempStr[20]==""?null:tempStr[20]);
                hotel2000wObj.setFax(tempStr[21]==""?null:tempStr[21]);
                hotel2000wObj.setEMail(tempStr[22]==""?null:tempStr[22]);
                hotel2000wObj.setNation(tempStr[23]==""?null:tempStr[23]);
                hotel2000wObj.setTaste(tempStr[24]==""?null:tempStr[24]);
                hotel2000wObj.setEducation(tempStr[25]==""?null:tempStr[25]);
                hotel2000wObj.setCompany(tempStr[26]==""?null:tempStr[26]);
                hotel2000wObj.setCTel(tempStr[27]==""?null:tempStr[27]);
                hotel2000wObj.setCAddress(tempStr[28]==""?null:tempStr[28]);
                hotel2000wObj.setCZip(tempStr[29]==""?null:tempStr[29]);
                hotel2000wObj.setFamily(tempStr[30]==""?null:tempStr[30]);
                hotel2000wObj.setVersion(tempStr[31]==""?null:tempStr[31]);
                hotel2000wObj.setId(tempStr[32]==""?null:tempStr[32]);
                hotelList.add(hotel2000wObj);
            }
        }

        if (!hotelList.isEmpty()){
            SqlSession session = DBUtil.getSession();
            hotel2000wMapper mapper = session.getMapper(hotel2000wMapper.class);
            mapper.insertBatch(hotelList);
            System.out.println("Done");
            session.commit();
        }
    }

    private void InsertHotelData() {

    }

    private static void selectAllPerson() throws IOException {

        SqlSession session = DBUtil.getSession();
        hotel2000wMapper mapper = session.getMapper(hotel2000wMapper.class);

        try {
            int item;
            List<hotel2000w> person = mapper.selectAllHotel();
            Stream.iterate(0, items -> items + 1).limit(10).forEach(
                    s -> System.out.println(s)
            );
            System.out.println(person.toString());

            session.commit();

        } catch (Exception e) {

            e.printStackTrace();

            session.rollback();

        }

    }

    //过滤特殊字符
    private static String StringFilter(String str) {
        str = str.replaceAll("\\\\", "");
        str = str.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        str = str.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
        str = str.replaceAll("'", "&#39;");
        str = str.replaceAll("eval\\((.*)\\)", "");
        str = str.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
        str = str.replaceAll("script", "");
        return str;
    }
}
