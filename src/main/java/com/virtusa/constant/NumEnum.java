/**
 * 
 */
package com.virtusa.constant;

/**
 * @author arvind.varma
 *
 */
public enum NumEnum {
	HYPHEN_ONE("-1", -1),
	ZERO("0", 0),
	ONE("1", 1),
	TWO("2", 2),
	TEN("10", 10),
	FIFTEEN("15",15),
	TWENTY("20",20),
	HUNDRED("100",100),
	THOUSAND("1000",1000),
	NINE_HUNDRED_NINE("999",999),
	NINE_THOUSAND_NINE_HUNDRED_NINE("999",999),
	ONE_9ZEROS("1000000000", 1000000000),
	ONE_6ZEROS("1000000", 1000000),
	NINE_NINES("999999999", 999999999);

    private final String key;
    private final Integer value;

    NumEnum(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}
