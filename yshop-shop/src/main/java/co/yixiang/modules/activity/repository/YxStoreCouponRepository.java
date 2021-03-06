package co.yixiang.modules.activity.repository;

import co.yixiang.modules.activity.domain.YxStoreCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author hupeng
* @date 2019-11-09
*/
public interface YxStoreCouponRepository extends JpaRepository<YxStoreCoupon, Integer>, JpaSpecificationExecutor {
}