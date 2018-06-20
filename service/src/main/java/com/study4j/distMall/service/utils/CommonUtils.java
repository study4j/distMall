package com.study4j.distMall.service.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

/**
 * 基础工具类
 */
public class CommonUtils {

    public static final String EMPTY = "";

    public static <T> boolean isNull(T object) {
        return null == object ? true : false;
    }

    public static <T> boolean isNotNull(T object) {
        return !isNull(object);
    }

    public static boolean isEmpty(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

    public static boolean isEmptyTrim(String s) {
        if (s == null || s.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmptyTrim(String s) {
        return !isEmptyTrim(s);
    }

    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    public static boolean checkEqualInt(Integer o1, Integer o2) {
        if (o1 == null && o2 == null) {
            return true;
        }
        if (o1 != null && o2 != null) {
            if (o1.intValue() == o2.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEqualLong(Long o1, Long o2) {
        if (o1 == null && o2 == null) {
            return true;
        }
        if (o1 != null && o2 != null) {
            if (o1.longValue() == o2.longValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEqualBigDecimal(BigDecimal o1, BigDecimal o2) {
        if (o1 == null && o2 == null) {
            return true;
        }
        if (o1 != null && o2 != null) {
            if (o1.compareTo(o2) == 0) {
                return true;
            }
        }
        return false;
    }

    public static Double getAndSetValue(Double value) {
        return Optional.ofNullable(value)
                .filter(s -> isNotNull(s))
                .orElse(0.0);
    }

    public static BigDecimal getAndSetValue(BigDecimal value) {
        return Optional.ofNullable(value)
                .filter(s -> isNotNull(s))
                .orElse(BigDecimal.ZERO);
    }

    public static Integer getAndSetValue(Integer value) {
        return Optional.ofNullable(value)
                .filter(s -> isNotNull(s))
                .orElse(0);
    }

    public static String getAndSetValue(String value) {
        return Optional.ofNullable(value)
                .filter(s -> isNotNull(s))
                .orElse(EMPTY);
    }

    public static Long getAndSetValue(Long value) {
        return Optional.ofNullable(value)
                .filter(s -> isNotNull(s))
                .orElse(0L);
    }


}
