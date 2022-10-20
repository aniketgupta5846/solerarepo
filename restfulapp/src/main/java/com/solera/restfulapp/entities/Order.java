package com.solera.restfulapp.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "order_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	private String orderDescription;
	private LocalDate orderDate;
	private Double orderAmount;
}
