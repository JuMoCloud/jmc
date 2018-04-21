package com.gkey.jmc.core.util;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;

/**
 * 
 * @author GuoKey[wszghj@aliyun.com]
 *
 */
public abstract class DateFormatUtils {

    /**
     * ��T�ָ����ں�ʱ�䣬����ʱ����Ϣ������ISO8601�淶
     */
    public static final String PATTERN_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSSZZ";
    public static final String PATTERN_ISO_ON_SECOND = "yyyy-MM-dd'T'HH:mm:ssZZ";
    public static final String PATTERN_ISO_ON_DATE = "yyyy-MM-dd";

    /**
     * �Կո�ָ����ں�ʱ�䣬����ʱ����Ϣ
     */
    public static final String PATTERN_DEFAULT = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String PATTERN_DEFAULT_ON_SECOND = "yyyy-MM-dd HH:mm:ss";

    // ʹ�ù�������FastDateFormat.getInstance(), �ӻ����л�ȡʵ��

    /**
     * ��T�ָ����ں�ʱ�䣬����ʱ����Ϣ������ISO8601�淶
     */
    public static final FastDateFormat ISO_FORMAT = FastDateFormat.getInstance(PATTERN_ISO);
    public static final FastDateFormat ISO_ON_SECOND_FORMAT = FastDateFormat.getInstance(PATTERN_ISO_ON_SECOND);
    public static final FastDateFormat ISO_ON_DATE_FORMAT = FastDateFormat.getInstance(PATTERN_ISO_ON_DATE);

    /**
     * �Կո�ָ����ں�ʱ�䣬����ʱ����Ϣ
     */
    public static final FastDateFormat DEFAULT_FORMAT = FastDateFormat.getInstance(PATTERN_DEFAULT);
    public static final FastDateFormat DEFAULT_ON_SECOND_FORMAT = FastDateFormat.getInstance(PATTERN_DEFAULT_ON_SECOND);

    /**
     * ���������ַ���, ������pattern���̶������. ����ֱ��ʹ��DateFormats�з�װ�õ�FastDateFormat.
     * FastDateFormat.getInstance()�Ѿ����˻��棬����ÿ�δ������󣬵�ֱ��ʹ�ö�����Ȼ�ܼ����ڻ����еĲ���.
     */
    public static Date pareDate(String pattern, String dateString) throws ParseException {
        return FastDateFormat.getInstance(pattern).parse(dateString);
    }

    /**
     * ��ʽ������, ������pattern���̶������. ����ֱ��ʹ�ñ����з�װ�õ�FastDateFormat.
     * FastDateFormat.getInstance()�Ѿ����˻��棬����ÿ�δ������󣬵�ֱ��ʹ�ö�����Ȼ�ܼ����ڻ����еĲ���.
     *
     * @param pattern
     *            ������ʽ
     * @param date
     *            ����
     * @return
     */
    public static String formatDate(String pattern, Date date) {
        return FastDateFormat.getInstance(pattern).format(date);
    }

    /**
     * ��ʽ������, �����ڲ��̶�pattern���̶������. �����ֱ��ʹ�ñ����з�װ�õ�FastDateFormat.
     * FastDateFormat.getInstance()�Ѿ����˻��棬����ÿ�δ������󣬵�ֱ��ʹ�ö�����Ȼ�ܼ����ڻ����еĲ���.
     *
     * @param pattern
     *            ������ʽ
     * @param date
     *            ����
     * @return
     */
    public static String formatDate(String pattern, long date) {
        return FastDateFormat.getInstance(pattern).format(date);
    }

    /**
     * ��HH:mm:ss.SSS��ʽ����ʽ��ʱ����. endDate�������startDate������ɴ���1��
     *
     * @param startDate
     *            ��ʼ����
     * @param endDate
     *            ��������
     * @return
     */
    public static String formatDuration(Date startDate, Date endDate) {
        return DurationFormatUtils.formatDurationHMS(endDate.getTime() - startDate.getTime());
    }

    /**
     * ��HH:mm:ss.SSS��ʽ����ʽ��ʱ���� ��λΪ���룬�������0���ɴ���1��
     *
     * @param durationMillis
     * @return
     */
    public static String formatDuration(long durationMillis) {
        return DurationFormatUtils.formatDurationHMS(durationMillis);
    }

    /**
     * ��HH:mm:ss��ʽ����ʽ��ʱ���� endDate�������startDate������ɴ���1��
     *
     * @param startDate
     *            ��ʼ����
     * @param endDate
     *            ��������
     * @return String
     */
    public static String formatDurationOnSecond(Date startDate, Date endDate) {
        return DurationFormatUtils.formatDuration(endDate.getTime() - startDate.getTime(), "HH:mm:ss");
    }

    /**
     * ��HH:mm:ss��ʽ����ʽ��ʱ���� ��λΪ���룬�������0���ɴ���1��
     *
     * @param durationMillis
     * @return
     */
    public static String formatDurationOnSecond(long durationMillis) {
        return DurationFormatUtils.formatDuration(durationMillis, "HH:mm:ss");
    }
}
