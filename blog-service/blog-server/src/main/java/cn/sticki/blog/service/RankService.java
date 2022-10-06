package cn.sticki.blog.service;

import cn.sticki.blog.pojo.vo.RankHotVO;

import java.util.List;

/**
 * @author durance
 */
public interface RankService {

	/**
	 * 获取当日博客热度排行榜
	 *
	 * @return 当日热度排行信息
	 */
	List<RankHotVO> getTodayHotRank();

	/**
	 * 获取近七日博客热度排行榜
	 *
	 * @return 本周热度排行信息
	 */
	List<RankHotVO> getWeekHotRank();

	/**
	 * 对相应博客执行热度加 3
	 *
	 * @param blogId 增加热度的博客
	 * @param score  增加的分数
	 */
	void addRankHotScore(Integer blogId, Double score);

}
