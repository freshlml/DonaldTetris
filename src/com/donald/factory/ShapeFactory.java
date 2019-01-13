package com.donald.factory;

import java.util.Random;

import com.donald.domain.Shape;

/**
 * 
 * @author Donald
 *	����һ����״��
 */
public class ShapeFactory {
	
	/*
	 * ��ά���鱣����ܵ���״
	 * ÿ����״Ϊʮ�������ӣ���1�����У���0����û��
	 * 
	 */
	private static int shapes[][][] = new int[][][] {
		/* ��һ�� */{ /** ***** */
		{ 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } },

		/* �ڶ��� */
		{ /** ********* */
		{ 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },

		{ 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 } },
		/* ������ */
		{ /** ******* */
		{ 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },

		{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 } },
		/* ������ */
		{ /** ******** */
		{ 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, } },
		/* ������ */
		{ /** ******** */
		{ 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 } },
		/* ������ */
		{ /** *********** */
		{ 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },

		{ 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 } },

		/* ������ */
		{ /** ********** */
		{ 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

		{ 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 } },

		};
	
	/*
	 * ÿ����һ�θ÷������ͻ��������һ��Shape���� 
	 */
	public static Shape createShape() {
		//���������״����
		Random rd = new Random();
		int type = rd.nextInt(shapes.length);
		//���������һtype�µ�ĳһ��״̬,which
		int which = rd.nextInt(shapes[type].length);
		//����Shape����
		Shape shape = new Shape(shapes[type],which);
		return shape;
	}
}