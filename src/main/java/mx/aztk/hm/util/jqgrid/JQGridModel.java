package mx.aztk.hm.util.jqgrid;

import java.util.List;
import java.util.Map;

public class JQGridModel {
	
	private Integer total;
	private Integer records;
	private Integer page;
	private List<Map<String, String>> rows;
	
	public JQGridModel() {
		
	}

	public JQGridModel(Integer total, Integer records, Integer page,
			List<Map<String, String>> rows) {
		
		this.total = total;
		this.records = records;
		this.page = page;
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "JQGridModel [total=" + total + ", records=" + records
				+ ", page=" + page + ", rows=" + rows + "]";
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<Map<String, String>> getRows() {
		return rows;
	}

	public void setRows(List<Map<String, String>> rows) {
		this.rows = rows;
	}
	
}
