package edu.bit.kit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.kit.vo.BoardVO;
import edu.bit.kit.vo.CouponVO;
import edu.bit.kit.vo.DeliveryVO;
import edu.bit.kit.vo.PointVO;
import edu.bit.kit.vo.UserVO;

@Mapper
public interface BoardMapper {

   public List<BoardVO> getEventList();


   public UserVO getUser(String userId);

   public PointVO getPoint(String userId);

   public List<CouponVO> getCoupon(String userId);
   
   public int getCouponCount(String userId);
   
   public int getExpCouponCount(String userId);

   public List<DeliveryVO> getDeliveryList(String userId);
   
   public void updateAccount(String userId, String userAccount);

}
