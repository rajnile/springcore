package com.spring.ExpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{10+30}")
	private int X;
	@Value("#{8*8}")
	private int Y;

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	@Override
	public String toString() {
		return "Demo [X=" + X + ", Y=" + Y + "]";
	}

}
