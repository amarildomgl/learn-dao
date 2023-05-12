package org.ucan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Amarildo Miguel
 */
public class DateUtils {

    private static final String FORMATO_PADRAO = "yyyy/MM/dd";

    public static String formatar(Date data, String formato) {
        DateFormat df = new SimpleDateFormat(formato);
        return df.format(data);
    }

    public static String formatar(Date data) {
        return formatar(data, FORMATO_PADRAO);
    }

    public static Date parse(String data, String formato) throws ParseException {
        DateFormat df = new SimpleDateFormat(formato);
        return df.parse(data);
    }

    public static Date parse(String data) throws ParseException {
        return parse(data, FORMATO_PADRAO);
    }

    public static Date adicionarDias(Date data, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return cal.getTime();
    }

    public static boolean isDataValida(String data) {
        DateFormat df = new SimpleDateFormat(FORMATO_PADRAO);
        df.setLenient(false);
        try {
            df.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
