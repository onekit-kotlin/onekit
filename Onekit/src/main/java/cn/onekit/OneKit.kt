package cn.onekit

open class OneKit {
    companion object {
        fun isNumber(v: Any?): Boolean {
            if (v == null) {
                return false;
            }
            return v is Number
        }

        fun number(value: Any?, nullValue: Any, nanValue: Any): Number {
            if (value == null) {
                return nullValue as Number
            }
            if (!isNumber(value)) {
                return nanValue as Number
            }
            return value as Number

        }
    }
}