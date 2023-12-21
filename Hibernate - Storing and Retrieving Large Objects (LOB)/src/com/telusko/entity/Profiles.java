package com.telusko.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Profiles 
{		@Id
        private Integer pid;		

		private String name;
		
		@Lob
		@Column(name="IMAGE")
		private byte[] img;
		
		@Lob
		@Column(name="DOC")
		private char[] charfile;
		
		public Profiles()
		{
			System.out.println("Zero param constructor for hibernate");
		}
		

		public Integer getPid() {
			return pid;
		}


		public void setPid(Integer pid) {
			this.pid = pid;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public byte[] getImg() {
			return img;
		}


		public void setImg(byte[] img) {
			this.img = img;
		}


		public char[] getCharfile() {
			return charfile;
		}


		public void setCharfile(char[] charfile) {
			this.charfile = charfile;
		}


		@Override
		public String toString() {
			return "Profile [pid=" + pid + ", name=" + name + ", img=" + Arrays.toString(img) + ", charfile="
					+ Arrays.toString(charfile) + "]";
		}
		
		
}
