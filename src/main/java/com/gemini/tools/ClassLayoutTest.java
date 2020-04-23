package com.gemini.tools;
import java.math.BigDecimal;
import java.util.Date;

import com.gemini.array.merge.TwoSortedMerge;
import com.gemini.base.TcOrder;
import org.openjdk.jol.info.ClassLayout;

import java.util.Random;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/3/28 10:39
 */
public class ClassLayoutTest {

    public static void main(String[] args) {
        TcOrder obj = new TcOrder();
        obj.setAcceptDeadline(new Date());
        obj.setOrderId(0L);
        obj.setOrderCode("");
        obj.setOrderCenterId(0L);
        obj.setUserId(0L);
        obj.setUserPhone("");
        obj.setUserName("");
        obj.setCustomId(0L);
        obj.setCustomPhone("");
        obj.setCustomName("");
        obj.setCategory(0L);
        obj.setServiceId(0L);
        obj.setOrderStatus(0);
        obj.setPayStatus(0);
        obj.setPayMethod(0);
        obj.setPayType(0);
        obj.setEvaluateStatus(0);
        obj.setServiceType(0);
        obj.setProductId(0L);
        obj.setProductNum(0);
        obj.setFinishNum(0);
        obj.setArrangeNum(0);
        obj.setProductTitle("");
        obj.setProductPrice(new BigDecimal("0"));
        obj.setProductUnit(0);
        obj.setCityId(0L);
        obj.setCityName("");
        obj.setAddress("");
        obj.setLocation("");
        obj.setTotalMoney(new BigDecimal("0"));
        obj.setEquipmentNum("");
        obj.setSource(0);
        obj.setHasChildOrder(0);
        obj.setHandleStatus(0);
        obj.setBusiStatus(0);
        obj.setRemark("");
        obj.setAcceptDate(new Date());
        obj.setEvaluateDate(new Date());
        obj.setStartDate(new Date());
        obj.setExpectDate(new Date());
        obj.setFinishDate(new Date());
        obj.setCancelDate(new Date());
        obj.setCreateDate(new Date());
        obj.setPayDate(new Date());
        obj.setBusiStatusDate(new Date());
        obj.setUpdater(0L);
        obj.setUpdaterName("");
        obj.setUpdateTime(new Date());
        obj.setOriginalPrice(new BigDecimal("0"));
        obj.setActivityPrice(new BigDecimal("0"));
        obj.setBalancePrice(new BigDecimal("0"));
        obj.setServicePhone("");
        obj.setOrgId(0L);
        obj.setServiceName("");
        obj.setCategoryName("");
        obj.setExperience(0);
        obj.setCustomType(0);
        obj.setThirdOrderId("");
        obj.setProductType(0);
        obj.setMoreProductFlag(0);
        obj.setClassification(0L);
        obj.setOrgRemark("");
        obj.setFinishType(0);
        obj.setAddPayment(new BigDecimal("0"));
        obj.setOrderType(0);
        obj.setEvaluateScore(new BigDecimal("0"));
        obj.setEvaluateFlag(0);
        obj.setProductSource(0);
        obj.setActivityId(0L);
        obj.setActivityProductNum(0);
        obj.setFinishSource(0);
        obj.setRealCancelTime(new Date());
        obj.setRealFinishTime(new Date());
        obj.setImmediateService(0);
        obj.setOrderFlow(0);
        obj.setDeleteMark(0);
        obj.setStartDurationDate(new Date());
        obj.setExpressFlag(0);
        obj.setAvailable(0);
        obj.setCustomWorkDone(0);
        obj.setWorkDoneDate(new Date());
        obj.setShareCustomId(0L);
        obj.setEnterpriseId(0L);
        obj.setGroupId(0L);

        // obj.setHeadMinge("https://baidu.com");
        // obj.setName("xiaodaomd");
        // obj.setUid(20078974759797979L);
        // obj.setNickName("花花");
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        //
        // // String str = "{'status':200,'msg':'下单成功'}";
        // StringBuffer stringBuffer = new StringBuffer();
        // stringBuffer.append("{'status':200,'msg':'下单成功'}");
        // System.out.println(ClassLayout.parseInstance(stringBuffer).toPrintable());
        //
        // Object object = new Object();
        // System.out.println(ClassLayout.parseInstance(object).toPrintable());
        // Long start = System.currentTimeMillis();
        // int source = 58412361;
        // int saltSource = 362;
        // int salt = (saltSource << 2) & (source >> 2);
        // int result = source ^ 31;
        // System.out.println("result=" + result);
        // // System.out.println("source=" + (result ^ salt));
        // // System.out.println("salt=" + (result ^ source));
        // System.out.println(System.currentTimeMillis() - start);
    }
}
