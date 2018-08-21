package cn.e3mall.cart.service;

import java.util.List;

import cn.e3mail.pojo.TbItem;
import cn.e3mall.common.utils.E3Result;

public interface CartService {
	
	/**
	 * 登录状态下添加商品
	 * @param userId	用户id
	 * @param itemId	商品id
	 * @return
	 */
	E3Result addCart(long userId,long itemId, int num);
	
	/**
	 * 登录状态下合并购物车
	 * @param userId
	 * @param list
	 * @return
	 */
	E3Result mergeCart(long userId,List<TbItem> list);
	/**
	 * 登录状态下取购物车列表
	 * @param userId
	 * @return
	 */
	List<TbItem> getCartList(long userId);
	/**
	 * 登录状态下更改购物车商品数量
	 * @param userId
	 * @param itemId
	 * @param num
	 * @return
	 */
	E3Result updateCartNum(long userId,long itemId,int num);
	
	/**
	 * 登录状态下删除购物车商品
	 * @param userId
	 * @param itemId
	 * @return
	 */
	E3Result deleteCartItem(long userId,long itemId);
	/**
	 * 根据Id清空购物车
	 * @param userId
	 * @return
	 */
	E3Result clearCartItem(long userId);
}
