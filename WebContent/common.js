(function($) {
	/**
	 * 依赖jquery-1.4.2 依赖jquery.json-2.2，参考http://code.google.com/p/jquery-json/
	 * 用于将form序列化成json串，并且可以反序列化添充回来 作者：段旭光 2010-08-08
	 */
	$.fn.serializeObjectToJson = function() {
		/**
		 * 此方法代码参考：http://css-tricks.com/snippets/jquery/serialize-form-to-json/
		 */
		var o = {};
		var a = this.serializeArray();
		$.each(a, function() {
			if (o[this.name]) {
				if (!o[this.name].push) {
					o[this.name] = [ o[this.name] ];
				}
				o[this.name].push(this.value || '');
			} else {
				o[this.name] = this.value || '';
			}
		});
		return o;
		// return $.toJSON(o);
	};
	/**
	 * 按json格式添充现有form,基中json的key对应form内的元素name
	 * 支持input、radio、select、textarea单值或多值 参数json为json对象
	 */
	$.fn.unSerializeObjectFromJson = function(json) {
		if (!json)
			return;
		var values = eval('(' + json + ')');
		var form = this;
		/**
		 * 得到现有form表单的内容，如果表单有默认值则全部清空，主要针对单值表单项，如：checkbox、radio，因为这些项如果不选中会不被序列化记录暂存，所以
		 * 在反序列化时，无法处理可能存在默认值的这些表单项，所以这里做一下特殊处理
		 */
		var defaultFormJsonValues = form.serializeObjectToJson();
		$.each(defaultFormJsonValues, function(key, value) {
			var object = form.find("*[name='" + key + "']");
			if (object.length == 1) {
				if (object.attr("type").toLowerCase() == 'radio'
						|| object.attr("type").toLowerCase() == 'checkbox') {
					object.attr("checked", false);
				}
			}
		});
		// 加载需要添充的表单内容
		$
				.each(
						values,
						function(key, value) {
							var object = form.find("*[name='" + key + "']");// 得到form内指定name的控件
							if (object.length == 1) {
								if (object.attr("type").toLowerCase() == 'radio'
										|| object.attr("type").toLowerCase() == 'checkbox') {
									if (object.val() == value) {
										object.attr("checked", true);
									}
									return true;
								} else {
									object.val(value);
								}
							} else if (object.length > 1) {
								object
										.each(function(i) {
											if (object.attr("type")
													.toLowerCase() == 'radio'
													|| object.attr("type")
															.toLowerCase() == 'checkbox') {
												if ($.inArray($(this).val(),
														value) != -1) {
													$(this).attr("checked",
															true);
												} else {
													$(this).attr("checked",
															false);
												}
											} else {
												$(this).val(value[i]);
											}
										});
							}
						});

	};
	/**
	 * 得到当前年的第一天
	 */
	$.getCurrentYearFirstDay = function(format) {
		var date = new Date();
		var fDate = new Date(date.getFullYear(), 0, 1, 0, 0, 0, 0);
		return $.getFormateDate(format, fDate);
	};
	/**
	 * 得到当前年的最后一天
	 */
	$.getCurrentYearLastDay = function(format) {
		var date = new Date();
		var fDate = new Date(date.getFullYear(), 11, 31, 23, 59, 59, 999);
		return $.getFormateDate(format, fDate);
	};
	/**
	 * 得到当前月的第一天
	 */
	$.getCurrentMonthFirstDay = function(format) {
		var date = new Date();
		var fDate = new Date(date.getFullYear(), date.getMonth(), 1, 0, 0, 0, 0);
		return $.getFormateDate(format, fDate);
	};
	/**
	 * 得到当前月的最后一天
	 */
	$.getCurrentMonthLastDay = function(format) {
		var date = new Date();
		var fDate = new Date(date.getFullYear(), date.getMonth() + 1, 0, 23,
				59, 59, 999);
		return $.getFormateDate(format, fDate);
	};
	/**
	 * 格式化日期
	 */
	$.getFormateDate = function(fmt, date) {
		if (!date)
			date = new Date();
		var o = {
			"M+" : date.getMonth() + 1, // 月份
			"d+" : date.getDate(), // 日
			"h+" : date.getHours() % 12 == 0 ? 12 : date.getHours() % 12, // 小时
			"H+" : date.getHours(), // 小时
			"m+" : date.getMinutes(), // 分
			"s+" : date.getSeconds(), // 秒
			"q+" : Math.floor((date.getMonth() + 3) / 3), // 季度
			"S" : date.getMilliseconds()
		// 毫秒
		};
		var week = {
			"0" : "\u65e5",
			"1" : "\u4e00",
			"2" : "\u4e8c",
			"3" : "\u4e09",
			"4" : "\u56db",
			"5" : "\u4e94",
			"6" : "\u516d"
		};
		if (/(y+)/.test(fmt)) {
			fmt = fmt.replace(RegExp.$1, (date.getFullYear() + "")
					.substr(4 - RegExp.$1.length));
		}
		if (/(E+)/.test(fmt)) {
			fmt = fmt
					.replace(
							RegExp.$1,
							((RegExp.$1.length > 1) ? (RegExp.$1.length > 2 ? "\u661f\u671f"
									: "\u5468")
									: "")
									+ week[date.getDay() + ""]);
		}
		for ( var k in o) {
			if (new RegExp("(" + k + ")").test(fmt)) {
				fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
						: (("00" + o[k]).substr(("" + o[k]).length)));
			}
		}
		return fmt;
	};
})(jQuery);