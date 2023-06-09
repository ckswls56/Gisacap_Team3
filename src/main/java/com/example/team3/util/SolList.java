package com.example.team3.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolList {
    HashMap<String, String> solList = new HashMap<>(); //각 질병에 관한 처방법 리스트
    HashMap<String, String> disList = new HashMap<>(); //각 질병의 병명
    HashMap<String, List<Integer>> symList = new HashMap<>(); //각 병마다 일어날 수 있는 증상

    public HashMap<String, List<Integer>> getSymList() {
        symList.put("s0", Arrays.asList(2,3,6,10,11));
        symList.put("s1",Arrays.asList(1,3,5,10,11));
        symList.put("s2",Arrays.asList(3));
        symList.put("s3",Arrays.asList(3,11));
        symList.put("s4",Arrays.asList(6,10,11));
        symList.put("s5",Arrays.asList(10,12));
        symList.put("s6",Arrays.asList(6,9,10,11));
        symList.put("s7",Arrays.asList(4));
        symList.put("s8",Arrays.asList(9));
        symList.put("s9",Arrays.asList(1,8));
        symList.put("s10",Arrays.asList(6,9,11));
        symList.put("s11",Arrays.asList(1,11));
        symList.put("s12",Arrays.asList(12));
        symList.put("s13",Arrays.asList(5));
        symList.put("s14",Arrays.asList(11));
        symList.put("s15",Arrays.asList(7));
        symList.put("s16",Arrays.asList(8));
        symList.put("s17",Arrays.asList(7));
        symList.put("s18",Arrays.asList(10));
        symList.put("s19",Arrays.asList(7));
        symList.put("s20",Arrays.asList(8));
        symList.put("s21",Arrays.asList(2));

        return symList;
    }
    public HashMap<String, String> getDisList() {
        disList.put("d0", "병에 걸리지 않음");
        disList.put("d1", "렙도바이러스병");
        disList.put("d2", "림포시스티스병");
        disList.put("d3", "바이러스성신경괴사증");
        disList.put("d4", "버나바이러스병");
        disList.put("d5", "헐피스 바이러스증");
        disList.put("d6", "비브리오병");
        disList.put("d7", "연쇄구균증");
        disList.put("d8", "에드워드병");
        disList.put("d9", "활주세균증");
        disList.put("d10", "백점충증");
        disList.put("d11", "스쿠티카증");
        disList.put("d12", "트리코디나증");

        return disList;
    }

    public HashMap<String, String> getSolList() {
        solList.put("d0", "병에 걸리지 않은 건강한 광어이다.");
        solList.put("d1", "육상수조인 경우는 사육 수온을 18℃ 이상으로 하면 좋다.\n" +
                "해면양식인 경우는 수온이 상승하면 자연 치유된다.\n" +
                "면역강화를 위해  「이뮤노피쉬」와 안정하고 흡수이용율이 좋은  「아쿠아씨」를 정기적으로 투여하면 건강한 어군을 만들어 준다.\n");
        solList.put("d2", "밀식을 피하고, 발병된 넙치는 격리 수용하여 원인균을 제거한다.\n" +
                "면역강화를 위해 「이뮤노피쉬」를 정기적으로 투여한다.\n" +
                "또한 어류의 점액을 증가시켜 바이러스나, 세균, 기생충감염을 방지시켜 주는 「포토자임」을 투여하여 항병력을 강화시켜 준다.\n");
        solList.put("d3", "섬전갱이, 범가자미 등에서는 산란친어의 생식소에서 VNN원인체가 높은 비율로 검출되며, 이 병의 주요감염원은 친어에서 전파되는 것으로 밝혀졌다.\n" +
                "따라서 VNN원인체에 감염되지 않은 친어를 사용한 것이 가장 정확한 예방법이 된다.\n" +
                "넙치를 비롯하여 복어에 이르기까지 모든 종묘생산에 있어서 VNN감염예방에 힘써야 한다.\n" +
                "안정성이 높고 흡수이용율이 좋은 「아쿠아씨」를 친어에 투여하면 산란율, 부화율을 향상시킬 뿐 아니라 건강한 치어를 만들어 생존율을 향상시킬 수 있으며 어류의 면역부활제인 「이뮤노피쉬」와 어류의 체표점액을 증가시켜 바이러스 감염을 방지시킬 수 있는 「포토자임」을 투여하여 항병력을 증가시켜준다.\n");
        solList.put("d4", "바이러스가 가장 잘 자라는 수온이 18~20℃였는데 이 수온에서는 증식이 빨라 넙치 치어 체내에 침입하여 증식하면 넙치의 방어력이 생기기전에 증식하므로 폐사율이 늘어난다.\n" +
                "13℃를 유지하면 살아있는 넙치에서 바이러스는 검출되나 폐사어는 나오지 않았다.\n" +
                "바이러스에 감염되어도 넙치의 저항력이 강해진 반면 바이러스의 증식이 완만하기 때문으로 생각된다.\n" +
                "따라서 저수온 사육이 폐사율을 줄이는 방법이며 면역증강제 「이뮤노피쉬」나 안정성이 높고 흡수이용율이 좋은 「아쿠아씨」 투여로 항병력을 강화시킬 수 있다.\n");
        solList.put("d5", "넙치 자어에 대한 감염실험에서 수온15~25℃의 범위내에서 가장 많이 폐사가 일어난다.\n" +
                "반면 수온이 13℃이하로 낮아지면 폐사 일수도 길어지고 폐사율도 감소한다.\n" +
                "남해종묘장에서는 수온을 16℃까지 하강시켰더니 폐사율이 줄어들면서 서서히 회복되었다고 한다.\n" +
                "안정성이 높고 흡수이용율이 좋은 「아쿠아씨」와 면역증강제 「이뮤노피쉬」 또는 어류의 점액을 증강시키는 생리활성물질 「포토자임」등을 투여하여 강건한 어체를 형성시키는 것이 중요하다.\n");
        solList.put("d6", "비브리오균 치료는  「히트마이신24」「옥소린산」이 효과적이며 건강한 어군을 형성시키기 위해 「이뮤노피쉬」「아도모피쉬」와 안정하고 흡수이용율이 좋은 「아쿠아씨」를 정기적으로 투여한다.");
        solList.put("d7", "연쇄구균증에 유효한 약제는 「한동 에리스로 250」「암피실린산」등이 있다.\n" +
                "「이뮤노피쉬」의 정기적인 투여로 항병력을 증강시키거나 「아도모피쉬」의 투여로 간기능을 강화시키면 약한 물고기를 보통의 물고기로 한단계 높여 주고 질병 감염으로부터 예방 할 수 있다.\n" +
                "또한 사육 밀도를 줄이고, 먹이의 과잉 투여를 피하며, 먹이 찌꺼기 등을 제거하고, 물의 교환을 자주하며, 적정한 사육환경을 유지하는데 힘 쓰도록 한다.\n");
        solList.put("d8", "물의 교환을 좋게 하고, 청소는 사육환경을 깨끗이 한다.\n" +
                "치료에는 「히트마이신24」,「옥소린산」등이 좋으며 간기능강화제 「아도모피쉬」를 병행하여 약제를 경구 투여하면 더욱 효과가 있다.\n" +
                "항병력을 높이기 위해 「이뮤노피쉬」와 안정하고 흡수이용율이 좋은 「아쿠아씨」를 정기적으로 투여한다.\n");
        solList.put("d9", "예방을 위해서는 밀식을 피하고 환수율을 높이는 것이 효과적이며 발병시는 병어를 조기 발견하여 격리시킨다.\n" +
                "「히트마이신 24」를 경구 투여하면 폐사율이 현저히 감소된다.\n" +
                "또한 항병력을 높이기 위해 「이뮤노피쉬」와 안정하고 흡수이용율이 좋은 「아쿠아씨」 및 어체의 점액을 증가시켜주는 생리활성물질 「포토자임」을 정기적으로 투여하여 건강한 어군을 형성시킨다.\n");
        solList.put("d10", "예방이 무엇보다도 중요하다. 환수량을 높여서 기생하지 못하게 하여야 한다.\n" +
                "물이 고이는 곳이 있으면 발생하기 쉬우며 사육밀도를 높여도 쉽게 발생한다.\n" +
                "백점충 예방구제약으로 허가된 제품은 오직 「포토자임」 뿐이며 어체중 1톤당 1일 400g씩 7일간 사료에 첨가하여 연속 투여하면 효과가 탁월하다.\n");
        solList.put("d11", "넙치 종묘에 유행되는 경우가 많기 때문에 종묘구입시 스쿠티카증에 감염되지 않는 것을 구입해야 한다.\n" +
                "밀식을 피하고 유기물질이 저면에 남아있지 않게 제거를 해 주는 것이 효과적이며, 아가미나 체표점액을 증가시켜 스쿠티카충의 기생을 막아주는 「포토자임」을 투여하면 예방에 효과적이다.\n" +
                "또한 건강한 어체 형성을 위해 면역증강제 「이뮤노피쉬」와 안정하고 흡수이용율이 좋은 「아쿠아씨」를 투여한다.\n");
        solList.put("d12", "현재 수산용으로 허가된 구제약품은 없다.\n" +
                "육상수조에서는 물량을 증가시키거나 수조의 밑바닥을 청소하면 효과적이며, 아가미나 체표의 점액을 증가시켜 기생충이 부착하지 못하도록 「포토자임」을 투여한다.\n" +
                "또한 건강한 어체 형성을 위해 면역부활제 「이뮤노피쉬」와 안정하고 흡수이용율이 좋은 「아쿠아씨」를 투여한다.\n");

        return solList;
    }


}
